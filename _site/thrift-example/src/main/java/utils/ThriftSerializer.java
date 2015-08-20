package utils;

import java.io.ByteArrayOutputStream;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

public class ThriftSerializer {

	/**
	 * Realiza a serialização do thrift.
	 *
	 * @param thrift - o thrift preenchido com as informações do atendimento.
	 * @return um array com os bytes serializados.
	 * @throws TException
	 */
	public static byte[] serialize(TBase<?, ? extends TFieldIdEnum> thrift) {
		ByteArrayOutputStream baos = null;

		try {
			baos = new ByteArrayOutputStream();
			TIOStreamTransport transport = new TIOStreamTransport(baos);
			TBinaryProtocol protocol = new TBinaryProtocol(transport);
			thrift.write(protocol);

			return baos.toByteArray();
		} catch (TException exception) {
			exception.printStackTrace();
		}

		return new byte[0];
	}

}
