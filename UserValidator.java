/**
 * Valida los datos del usuario, como nombre, correo y contraseña.
 * Cada método se asegura de que el dato cumpla con los requisitos específicos.
 */
public class UserValidator {

    /**
     * Valida que el nombre sea válido (más de 3 caracteres).
     */
    public boolean isValidName(String name) {
        return name != null && name.length() > 3;
    }

    /**
     * Valida que el correo electrónico sea válido (contenga "@" y ".").
     */
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    /**
     * Valida que la contraseña sea válida (al menos 8 caracteres y contenga un número).
     */
    public boolean isValidPassword(String password) {
        return password != null && password.length() >= 8 && password.matches(".*[0-9].*");
    }
}
