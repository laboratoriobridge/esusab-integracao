package examplo.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import br.gov.saude.esus.transport.common.generated.thrift.DadoTransporteThrift;

public class ZipWriterExemplo {

	private final static String EXTENSAO_EXPORT = ".esus";

	/**
	 * Gera um arquivo .zip contendo os dados serializados.
	 *
	 * @param procedimentos - a lista com os dados (thrifts) a serem serializados e armazenados no arquivo .zip
	 */
	public static void generateZip(DadoTransporteThrift thrift) {
		try {
			File zipFile = new File(System.getProperty("user.home") + "/exemploConversaoThrift.zip");
			ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile));

			String entryName = thrift.getUuidDadoSerializado() + EXTENSAO_EXPORT;
			outputStream.putNextEntry(new ZipEntry(entryName));
			byte[] data = ThriftSerializer.serializeBinary(thrift);
			outputStream.write(data);

			outputStream.closeEntry();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
