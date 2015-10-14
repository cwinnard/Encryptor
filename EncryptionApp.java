import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EncryptionApp {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String message = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the message to be encrypted: ");
		message = sc.nextLine();
		
		Encrypt encryptor = new Encrypt();
		encryptor.encryptMessage(message);
		message = encryptor.getEncryptedMessage();
		System.out.println(message);
		
		Decrypt decryptor = new Decrypt();
		decryptor.decryptMessage(message);
		message = decryptor.getDecryptedMessage();
		System.out.println(message);
		
		sc.close();
	}
}
