/**
 * Simula la persistencia de un usuario en la base de datos.
 * Guarda al usuario en la base de datos (simulado).
 */
public class UserRepository {

    /**
     * Guarda el usuario en la base de datos (simulado).
     */
    public void save(User user) {
        System.out.println("Guardando usuario en la base de datos: " + user.getName());
    }
}
