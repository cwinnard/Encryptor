import java.io.UnsupportedEncodingException;

public class Decrypt {
	String decryptedMessage = "";

	public void decryptMessage(String message) throws UnsupportedEncodingException {
		byte[] bytes = convertEncryptedMessageToBytes(message);
		convertBytesToOriginalMessage(bytes);
	}

	private byte[] convertEncryptedMessageToBytes(String message) throws UnsupportedEncodingException {
		byte bytes[] = message.getBytes("US-ASCII");
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (32 + (126 - bytes[i]));
		}
		return bytes;
	}

	private void convertBytesToOriginalMessage(byte[] bytes) {
		for (int i = 0; i < bytes.length; i++) {
			decryptedMessage += (char) bytes[i];
		}
	}

	public String getDecryptedMessage() {
		return decryptedMessage;
	}
}
