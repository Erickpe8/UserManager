/**
 * Excepción personalizada para manejar errores en la creación de usuarios.
 * Se lanza cuando hay un problema con los datos del usuario durante la creación.
 */
public class UserCreationException extends Exception {
    
    public UserCreationException(String message) {
        super(message);
    }
}
