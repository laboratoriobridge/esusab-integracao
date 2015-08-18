package example;

import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

public class InformacoesEnvioExemplo {

	public static DadoTransporteThrift getInfoInstalacao() {
		DadoTransporteThrift dadoTransporteThrift = new DadoTransporteThrift();

		DadoInstalacaoThrift originadora = new DadoInstalacaoThrift();
		originadora.setContraChave("123456");
		originadora.setCpfOuCnpj("11111111111");
		originadora.setEmail("a@b.com");
		originadora.setFone("999999999");
		originadora.setNomeOuRazaoSocial("Nome ou Razao Social Originadora");
		originadora.setUuidInstalacao("UUIDUNICO111");
		dadoTransporteThrift.setOriginadora(originadora);

		DadoInstalacaoThrift remetente = new DadoInstalacaoThrift();
		remetente.setContraChave("789010");
		remetente.setCpfOuCnpj("11111111111");
		remetente.setEmail("b@a.com");
		remetente.setFone("98888888");
		remetente.setNomeOuRazaoSocial("Nome ou Razao Social Remetente");
		remetente.setUuidInstalacao("UUIDUNICO222");
		dadoTransporteThrift.setRemetente(remetente);

		// Opcionais;
		dadoTransporteThrift.setNumLote(0l);

		VersaoThrift versaoThrift = new VersaoThrift();
		versaoThrift.setMajor(2);
		versaoThrift.setMinor(0);
		versaoThrift.setRevision(0);
		dadoTransporteThrift.setVersao(versaoThrift);

		return dadoTransporteThrift;
	}
}
