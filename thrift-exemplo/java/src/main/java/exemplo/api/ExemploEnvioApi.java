package exemplo.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

import exemplo.ExemploFichaProcedimentoThrift;
import exemplo.common.SerializadorThrift;

public class ExemploEnvioApi {

	public static void main(String[] args) throws IOException {

		// Passo 1: Setar os valores nas variáveis USUARIO_CREDENCIAL, SENHA_CREDENCIAL e APPLICATION_URL abaixo para configurar o envio
		String USUARIO_CREDENCIAL = "COLOQUE_AQUI_USUARIO";    /* Usuário da credencial obtida com o responsável pelo recebimento. */
		String SENHA_CREDENCIAL = "COLOQUE_AQUI_SENHA";    /* Senha da credencial obtida com o responsável pelo recebimento. */
		String APPLICATION_URL = "COLOQUE_AQUI_URL_SERVIDOR_PEC";  /* Endereço de ip da instalação a se fazer o envio */
		String LOGIN_URL = APPLICATION_URL + "/api/recebimento/login";
		String ENVIO_URL = APPLICATION_URL + "/api/v1/recebimento/ficha";


		// Passo 2: Criar um client http
		try (CloseableHttpClient client = HttpClients.createDefault()) {

			// Passo 3: Configurar post de login com credenciais
			HttpPost loginPost = new HttpPost(LOGIN_URL);
			loginPost.setEntity(MultipartEntityBuilder
					.create()
					.addTextBody("usuario", USUARIO_CREDENCIAL)
					.addTextBody("senha", SENHA_CREDENCIAL)
					.build());

			// Passo 4: Executar o post de login
			client.execute(loginPost, response -> {
				// Passo 4.1: Tratar resposta de erro no login
				if (HttpStatus.SC_OK != response.getCode()) {
					throw new RuntimeException("\n" +
							"Erro ao fazer login. \n" +
							"Código da resposta: " + response.getCode() + "\n" +
							"Mensagem de erro: " + EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8));
				}
				return response.getCode();
			});

			/**
			 * Ao ter sucesso no Login o servidor envia um set cookie JSESSIONID que contem o id da sessão
			 * na lib de client http usada, ela ja envia esse cookie automaticamente nos proximos requests
			 * se a lib utilizada não fizer isso, é necessario obter o cookie e enviar manualmente
			 */

			// Passo 5: Criar um DadoTransporteThrift com a ficha preenchida
			DadoTransporteThrift fichaExemplo = ExemploFichaProcedimentoThrift.getDadoTransporte();

			// Passo 6: Serializar a ficha
			byte[] fichaExemploSerializada = SerializadorThrift.serializar(fichaExemplo);

			// Passo 7: Definir o nome do arquivo serializado UUID + ".esus"
			String filename = fichaExemplo.getUuidDadoSerializado() + ".esus";

			// Passo 8: Configurar post de envio de ficha informando atributo ficha e o arquivo serializado, importante que o nome do arquivo seja o uuid da ficha + ".esus"
			HttpPost sendFicha = new HttpPost(ENVIO_URL);
			sendFicha.setEntity(MultipartEntityBuilder
					.create()
					.addBinaryBody("ficha", fichaExemploSerializada, ContentType.APPLICATION_OCTET_STREAM, filename)
					.build());

			// Passo 9: Executar o post de envio de ficha
			client.execute(sendFicha, response -> {
				// Passo 9.1: Tratar resposta de erro no envio de ficha
				if (HttpStatus.SC_CREATED != response.getCode()) {
					throw new RuntimeException("\n" +
							"Erro ao enviar ficha. \n" +
							"Código da resposta: " + response.getCode() + "\n" +
							"Mensagem de erro: " + EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8));
				}
				return response.getCode();
			});

		}
	}

}
