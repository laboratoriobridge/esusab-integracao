package exemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import br.gov.saude.esusab.ras.common.UnicaLotacaoHeaderThrift;
import br.gov.saude.esusab.ras.atendprocedimentos.FichaProcedimentoChildThrift;
import br.gov.saude.esusab.ras.atendprocedimentos.FichaProcedimentoMasterThrift;
import br.gov.saude.esus.transport.common.api.configuracaodestino.VersaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoInstalacaoThrift;
import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

public class ExemploFichaProcedimentoThrift {

	private final static String EXTENSAO_EXPORT = ".esus";
	private static long TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO = 7;

	public static void main(String[] args) {
		// Passo 1: Popular a ficha
		FichaProcedimentoMasterThrift thriftFichaProcedimento = getFicha();

		// Passo 2: Popular o DadoTransporte usando os dados da ficha e do software que está enviando.
		DadoTransporteThrift dadoTransporteThrift = getDadoTransporte(thriftFichaProcedimento);

		// Passo 3: Serializar a ficha utilizando o TBinaryProtocol da biblioteca thrift.
		byte[] fichaSerializada = SerializadorThrift.serializar(thriftFichaProcedimento);

		// Passo 4: Adicionar a ficha serializada e seu tipo no DadoTransporte.
		dadoTransporteThrift.setTipoDadoSerializado(TIPO_DADO_SERIALIZADO_FICHA_PROCEDIMENTO);
		dadoTransporteThrift.setDadoSerializado(fichaSerializada);

		// Não esquecer de informar a versão da ficha a ser exportada (não é a versão do e-SUS AB)
		VersaoThrift versaoThrift = new VersaoThrift(3, 2, 3);
		dadoTransporteThrift.setVersao(versaoThrift);

		try {
			// Passo 5: Criar um arquivo zip para conter as fichas
			File zipFile = new File(System.getProperty("user.home") + "/exemploConversaoThrift.zip");
			ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));

			// Passo 6: Dar um nome para o arquivo (nesse caso usamos o UUID da ficha) sempre acrescentando a extensão ".esus" ao final
			String entryName = dadoTransporteThrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;

			// Passo 7: Adicionar uma nova entrada (novo arquivo) dentro do zip com o nome definido
			outputStream.putNextEntry(new ZipEntry(entryName));

			// Passo 8: serializar o DadoTransporte utilizando o TBinaryProtocol da biblioteca thrift
			byte[] dadoTransporteSerializado = SerializadorThrift.serializar(dadoTransporteThrift);

			// Passo 9: escrever o dadoTransporteSerializado no arquivo zip
			outputStream.write(dadoTransporteSerializado);

			// Para adicionar mais fichas no mesmo zip, repetir os passos 6, 7, 8 e 9 com as demais fichas

			// Passo 10: Finalizar o arquivo zip
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retorna um DadoTransporteThrift preenchido com valores válidos fictícios.
	 *
	 * @return DadoTransporteThrift
	 */

	public static DadoTransporteThrift getDadoTransporte(FichaProcedimentoMasterThrift ficha) {
		DadoTransporteThrift dadoTransporteThrift = new DadoTransporteThrift();

		dadoTransporteThrift.setUuidDadoSerializado(ficha.getUuidFicha());
		dadoTransporteThrift.setIneDadoSerializado(ficha.getHeaderTransport().getIne());
		dadoTransporteThrift.setCodIbge(ficha.getHeaderTransport().getCodigoIbgeMunicipio());
		dadoTransporteThrift.setCnesDadoSerializado(ficha.getHeaderTransport().getCnes());

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

		dadoTransporteThrift.setNumLote(0l);



		return dadoTransporteThrift;
	}

	/**
	 * Retorna uma FichaProcedimentoMasterThrift preenchida com valores válidos fictícios..
	 */
	private static FichaProcedimentoMasterThrift getFicha() {
		FichaProcedimentoMasterThrift thriftProcedimentos = new FichaProcedimentoMasterThrift();

		String uuidFicha = UUID.randomUUID().toString();
		thriftProcedimentos.setUuidFicha(uuidFicha);

		thriftProcedimentos.setAtendProcedimentos(getAtendimentos());
		thriftProcedimentos.setHeaderTransport(getHeader());

		thriftProcedimentos.setNumTotalAfericaoPa(1);
		thriftProcedimentos.setNumTotalAfericaoTemperatura(1);
		thriftProcedimentos.setNumTotalColetaMaterialParaExameLaboratorial(1);
		thriftProcedimentos.setNumTotalCurativoSimples(1);
		thriftProcedimentos.setNumTotalGlicemiaCapilar(1);
		thriftProcedimentos.setNumTotalMedicaoAltura(1);
		thriftProcedimentos.setNumTotalMedicaoPeso(1);

		thriftProcedimentos.setTpCdsOrigem(3);

		return thriftProcedimentos;
	}

	/**
	 * Retorna um UnicaLotacaoHeaderThrift preenchido com valores válidos fictícios..
	 */
	private static UnicaLotacaoHeaderThrift getHeader() {
		UnicaLotacaoHeaderThrift headerThrift = new UnicaLotacaoHeaderThrift();

		Calendar dataAtendimento = Calendar.getInstance();
		dataAtendimento.set(2019, 11, 20);
		headerThrift.setDataAtendimento(dataAtendimento.getTimeInMillis());

		headerThrift.setCboCodigo_2002("223212");
		headerThrift.setCnes("7381123");
		headerThrift.setCodigoIbgeMunicipio("4205407");
		headerThrift.setIne("0000406465");
		headerThrift.setProfissionalCNS("898001160660761");

		return headerThrift;
	}

	/**
	 * Retorna uma lista de FichaProcedimentoChildThrift preenchida com valores válidos fictícios..
	 */
	private static List<FichaProcedimentoChildThrift> getAtendimentos() {
		List<FichaProcedimentoChildThrift> listaProcedimentosAtendimento = new ArrayList<>();

		for (Integer numeroAtendimentos = 0; numeroAtendimentos < 2; numeroAtendimentos++) {
			FichaProcedimentoChildThrift atendimentoProcedimentoThrift = new FichaProcedimentoChildThrift();

			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.set(2014, 11, 20);
			atendimentoProcedimentoThrift.setDtNascimento(dataNascimento.getTimeInMillis());

			atendimentoProcedimentoThrift.setLocalAtendimento(1);
			atendimentoProcedimentoThrift.setCnsCidadao("898001161218973");
			atendimentoProcedimentoThrift.setNumProntuario("43143");
			atendimentoProcedimentoThrift.setSexo(1);
			atendimentoProcedimentoThrift.setTurno(1);

			atendimentoProcedimentoThrift.setProcedimentos(getProcedimentosSia());
			atendimentoProcedimentoThrift.setProcedimentos(getProcedimentos());

			listaProcedimentosAtendimento.add(atendimentoProcedimentoThrift);
		}

		return listaProcedimentosAtendimento;
	}

	/**
	 * Retorna códigos gerais de procedimentos SIA.
	 */
	private static List<String> getProcedimentosSia() {
		List<String> siaList = new ArrayList<>();

		siaList.add("ABEX010"); // MAMOGRAFIA BILATERAL;
		siaList.add("ABEX007"); // HDL;
		siaList.add("ABEX009"); // LDL;

		return siaList;
	}

	/**
	 * Retorna códigos gerais de procedimentos realizados.
	 */
	private static List<String> getProcedimentos() {
		List<String> procedimentosList = new ArrayList<>();

		procedimentosList.add("ABPG019"); // SUTURA SIMPLES;
		procedimentosList.add("ABEX004"); // ELETROCARDIOGRAMA;

		return procedimentosList;
	}

}
