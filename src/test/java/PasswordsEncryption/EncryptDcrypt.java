package PasswordsEncryption;

import java.util.Base64;
public class EncryptDcrypt {

	public static void main (String[] args) {
		String Password = "Password@1234123";
		// Create byte array - Password accessed by all users so to control use base64 encryption
		byte[] encrypt = Base64.getEncoder().encode(Password.getBytes());
		System.out.println("Encrypted password is ---->"+ new String(encrypt));
		
		byte[] decrypt = Base64.getDecoder().decode(encrypt);
		System.out.println("Decrypted password is ---->"+ new String(decrypt));
		
	}
}