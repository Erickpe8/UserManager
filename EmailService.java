/**
 * Envía correos electrónicos al usuario.
 * Se utiliza para enviar correos de bienvenida u otros correos necesarios.
 */
public class EmailService {

    /**
     * Envía un correo de bienvenida al usuario.
     */
    public void sendWelcomeEmail(String email) {
        System.out.println("Enviando correo de bienvenida a: " + email);
    }
}
