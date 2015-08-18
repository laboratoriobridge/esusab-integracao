package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

public class ZipWriterExemplo {

	// private final static String EXTENSAO_EXPORT_V12 = ".cds";
	private final static String EXTENSAO_EXPORT = ".esus";

	/**
	 * Gera um arquivo .zip contendo os dados serializados.
	 *
	 * @param procedimentos - a lista com os dados (thrifts) a serem serializados e armazenados no arquivo .zip
	 */
	public static void generateZip(DadoTransporteThrift thrift) {
		File zipFile = new File(System.getProperty("user.home") + "/exemploConversaoThrift.zip");
		ZipOutputStream outputStream = null;

		try {
			outputStream = new ZipOutputStream(new FileOutputStream(zipFile));
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}

		if (outputStream != null) {
			// for (DadoTransporteThrift thrift : dadoTransporteThrift) {
			try {
				String entryName = resolveZipEntry(thrift);
				outputStream.putNextEntry(new ZipEntry(entryName));
				byte[] data = ThriftSerializer.serialize(thrift);
				outputStream.write(data);

				outputStream.closeEntry();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// }
		}
	}

	/**
	 * Determina o nome e a extensão das entradas do arquivo .zip
	 *
	 * @param l - o arquivo thrift a ser analisado
	 * @return o nome da entrada no arquivo .zip
	 */
	private static String resolveZipEntry(DadoTransporteThrift thrift) {
		String entryName = thrift.getTipoDadoSerializado() + "";

		// Realizar os testes de tipos e escolher qual o nome de cada entrada do arquivo zip gerado;
		if (thrift.getTipoDadoSerializado() == 7) { // Thrift Procedimentos;
			entryName = thrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
		}

		return entryName;
	}
}
