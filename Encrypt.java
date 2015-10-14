import java.io.UnsupportedEncodingException;

public class Encrypt {
	String encryptedMessage = "";

	public void encryptMessage(String message) throws UnsupportedEncodingException {
		byte[] bytes = convertOriginalMessageToBytes(message);
		convertBytesToEncryptedMessage(bytes);
	}

	private byte[] convertOriginalMessageToBytes(String message) throws UnsupportedEncodingException {
		byte bytes[] = message.getBytes("US-ASCII");
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (126 - (bytes[i] - 32));
		}
		return bytes;
	}

	private void convertBytesToEncryptedMessage(byte[] bytes) {
		for (int i = 0; i < bytes.length; i++) {
			encryptedMessage += (char) bytes[i];
		}
	}

	public String getEncryptedMessage() {
		return encryptedMessage;
	}
}
