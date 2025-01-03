package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 32;

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        
        return checkPasswordCriteria(password);
    }

    private static String checkPasswordCriteria(String password) {
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            } else if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            } else if (Character.isDigit(symbol)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
            if (hasUpCase && hasLowCase && hasDigit && hasSpecial) {
            	break;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String lowerCasePassword = password.toLowerCase();
        for (String forbidden : FORBIDDEN) {
            if (lowerCasePassword.contains(forbidden)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password; 
    }
}
