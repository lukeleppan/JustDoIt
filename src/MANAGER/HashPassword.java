package MANAGER;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashPassword {

	public String hashPassword(char[] password) throws NoSuchAlgorithmException {
		String hashPassword = "";

		byte[] bytesPassword = new String(password).getBytes();

		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] digest = md.digest(bytesPassword);

		hashPassword = new String(digest);

		return hashPassword;
	}

}
