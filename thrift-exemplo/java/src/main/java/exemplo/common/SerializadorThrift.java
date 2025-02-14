package exemplo.common;

import java.io.ByteArrayOutputStream;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

public class SerializadorThrift {

	/**
	 * Realiza a serialização do thrift.
	 *
	 * @param thrift - o thrift preenchido com as informações do atendimento.
	 * @return um array com os bytes serializados.
	 */
	public static byte[] serializar(TBase<?, ? extends TFieldIdEnum> thrift) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			TIOStreamTransport transport = new TIOStreamTransport(baos);
			TBinaryProtocol protocol = new TBinaryProtocol(transport);
			thrift.write(protocol);

			return baos.toByteArray();
		} catch (TException exception) {
			exception.printStackTrace();
		}
		return null;
	}

}
