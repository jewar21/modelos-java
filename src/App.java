// Clase principal
import models.controller.UserController;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Gestión de Usuarios:");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Mostrar Usuario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el email del usuario: ");
                    String email = scanner.nextLine();
                    userController.crearUsuario(nombre, email);
                    System.out.println("Usuario creado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el ID del usuario a mostrar: ");
                    int id = scanner.nextInt();
                    userController.mostrarUsuario(id);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
    }
}
