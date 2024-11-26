package exemplo.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

import exemplo.ExemploFichaProcedimentoThrift;
import exemplo.common.SerializadorThrift;

public class ExemploGeracaoZip {

	private static final String EXTENSAO_EXPORT = ".esus";

	public static void main(String[] args) {

		// Passo 1: Criar um DadoTransporteThrift com a ficha preenchida
		DadoTransporteThrift dadoTransporteThrift = ExemploFichaProcedimentoThrift.getDadoTransporte();

		try {
			// Passo 2: Criar um arquivo zip para conter as fichas
			File zipFile = new File(System.getProperty("user.home") + "/exemploConversaoThrift.zip");
			ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));

			// Passo 3: Dar um nome para o arquivo (nesse caso usamos o UUID da ficha) sempre acrescentando a extensão ".esus" ao final
			String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;

			// Passo 4: Adicionar uma nova entrada (novo arquivo) dentro do zip com o nome definido
			outputStream.putNextEntry(new ZipEntry(entryName));

			// Passo 5: serializar o DadoTransporte utilizando o TBinaryProtocol da biblioteca thrift
			byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift);

			// Passo 6: escrever o dadoTransporteSerializado no arquivo zip
			outputStream.write(dadoTransporteSerializado);

			// Para adicionar mais fichas no mesmo zip, repetir os passos 3, 4, 5 e 6 com as demais fichas

			// Passo 7: Finalizar o arquivo zip
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
