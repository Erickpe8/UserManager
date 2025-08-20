/**
 * Gestiona los logs del sistema.
 * Registra mensajes de eventos importantes como la creación de un usuario.
 */
public class Logger {

    /**
     * Registra un mensaje en los logs.
     */
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
