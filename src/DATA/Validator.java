package DATA;

import java.util.Date;

public class Validator {

    private String firstname;
    private String surname;
    private String username;
    private String email;
    private Date DOB;
    private char[] password;
    private char[] repeatPassword;

    public Validator(String firstname, String surname, String username, String email, Date DOB, char[] password, char[] repeatPassword) {
        this.firstname = firstname;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.DOB = DOB;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    boolean validateFirstname() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateFirstnameLength() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateSurname() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateSurnameLength() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateUsername() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateUsernameLength() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateEmail() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validateEmailLength() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validatePasswordMatch() {
        boolean valid = true;

        // TODO
        return valid;
    }

    boolean validatePassword() {
        boolean valid = true;

        // TODO
        return valid;
    }
}
