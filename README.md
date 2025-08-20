# UserManager

Este proyecto simula el proceso de creación de un usuario, validando los datos ingresados, guardándolos en una base de datos (simulada), enviando un correo de bienvenida y registrando la acción en un log.

## Flujo de Trabajo

1. **Main.java**:
   - Punto de entrada del programa.
   - Se crean instancias de todas las clases necesarias (`UserManager`, `UserValidator`, `UserRepository`, `EmailService`, `Logger`).
   - Llama al método `createUser` de `UserManager` para crear un nuevo usuario.

2. **UserManager.java**:
   - Gestiona la creación del usuario.
   - Realiza las validaciones de los datos usando `UserValidator`.
   - Si los datos son válidos, guarda el usuario con `UserRepository`, envía un correo con `EmailService` y registra la acción con `Logger`.

3. **UserValidator.java**:
   - Contiene métodos para validar el nombre, email y contraseña del usuario.
   - Asegura que el nombre sea mayor a 2 caracteres, el email tenga un formato válido y la contraseña sea segura.

4. **UserRepository.java**:
   - Simula la persistencia de los datos del usuario.
   - Guarda el usuario en la "base de datos" (en este caso, solo imprime un mensaje en consola).

5. **EmailService.java**:
   - Simula el envío de un correo electrónico de bienvenida al usuario.
   - Imprime un mensaje en consola indicando que el correo fue enviado.

6. **Logger.java**:
   - Registra eventos en el sistema (como la creación de un usuario).
   - Imprime un mensaje en consola con el registro del evento.

7. **User.java**:
   - Define la estructura de un usuario, con los atributos `name`, `email`, y `password`.

8. **UserCreationException.java**:
   - Excepción personalizada lanzada cuando los datos del usuario no son válidos.

## Mejoras Implementadas

- **SRP (Responsabilidad Única)**: Cada clase tiene una responsabilidad clara y única (por ejemplo, `UserValidator` solo valida, `UserRepository` solo guarda).
- **DRY (Don't Repeat Yourself)**: Se centralizó la lógica de validación en métodos reutilizables dentro de `UserValidator`, eliminando duplicación de código.
- **KISS (Keep It Simple, Stupid)**: Simplificamos el flujo de validación y la creación de usuario para evitar complicaciones innecesarias.
- **Fail Fast**: Implementamos validaciones tempranas en el flujo (al principio del proceso), lanzando excepciones de forma inmediata si los datos no son válidos.

