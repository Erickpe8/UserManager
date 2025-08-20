/**
 * Clase principal para ejecutar el programa.
 * Crea un usuario utilizando `UserManager` y maneja las excepciones de creación de usuario.
 * Si la creación del usuario es exitosa, imprime un mensaje de éxito, de lo contrario, imprime el error.
 */
public class Main {

    /**
     * Método principal para ejecutar el programa.
     * Crea un usuario utilizando `UserManager` y maneja las excepciones si los datos son incorrectos.
     */
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        UserValidator userValidator = new UserValidator();
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();
        Logger logger = new Logger();

        // Crear una instancia de UserManager
        UserManager userManager = new UserManager(userValidator, userRepository, emailService, logger);

        try {
            // Intentar crear un usuario
            userManager.createUser("Erick Perez", "Ericksperezc@gmail.com", "Abcde123");
            System.out.println("Usuario creado correctamente.");
        } catch (UserCreationException e) {
            System.out.println(e.getMessage());
        }
    }
}
