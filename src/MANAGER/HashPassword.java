package MANAGER;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class HashPassword {

    String hashPassword(String password) throws NoSuchAlgorithmException {
        String hashPassword = "";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        hashPassword = DatatypeConverter.printHexBinary(digest);

        return hashPassword;
    }

}
