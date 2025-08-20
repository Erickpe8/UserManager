/**
 * Gestiona la creación del usuario.
 * Valida los datos del usuario y, si son correctos, guarda al usuario y envía un correo de bienvenida.
 */
public class UserManager {

    private UserValidator userValidator;
    private UserRepository userRepository;
    private EmailService emailService;
    private Logger logger;

    public UserManager(UserValidator userValidator, UserRepository userRepository, EmailService emailService, Logger logger) {
        this.userValidator = userValidator;
        this.userRepository = userRepository;
        this.emailService = emailService;
        this.logger = logger;
    }

    /**
     * Crea un nuevo usuario, validando sus datos primero.
     * Si los datos son válidos, guarda el usuario y envía un correo de bienvenida.
     * Si hay un error en los datos, lanza una excepción.
     */
    public void createUser(String name, String email, String password) throws UserCreationException {
        if (!userValidator.isValidName(name)) {
            throw new UserCreationException("Error: Nombre inválido.");
        }
        if (!userValidator.isValidEmail(email)) {
            throw new UserCreationException("Error: Email inválido.");
        }
        if (!userValidator.isValidPassword(password)) {
            throw new UserCreationException("Error: Password inválido.");
        }

        User user = new User(name, email, password);
        userRepository.save(user);
        emailService.sendWelcomeEmail(user.getEmail());
        logger.log("Usuario " + user.getName() + " creado exitosamente.");
    }
}
