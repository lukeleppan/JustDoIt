package MANAGER;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class HashPassword {

    public String hashPassword(String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String hashPassword = "";

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

        byte[] hash = factory.generateSecret(spec).getEncoded();

        hashPassword = Arrays.toString(salt) + Arrays.toString(hash);

        return hashPassword;
    }

}
