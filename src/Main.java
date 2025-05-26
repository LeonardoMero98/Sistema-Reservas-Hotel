import java.util.Scanner;

/**
 * Clase Principal - Sistema de Gestión de Reservas
 * @author Kevin Cathme
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel("Hotel POO");

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║  SISTEMA DE GESTIÓN DE RESERVAS HOTEL  ║");
        System.out.println("║           Programación II              ║");
        System.out.println("╚════════════════════════════════════════╝");

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    crearNuevaReserva();
                    break;
                case 2:
                    hotel.consultarDisponibilidad();
                    break;
                case 3:
                    hotel.mostrarHabitacionesDisponibles();
                    break;
                case 4:
                    hotel.mostrarInfo();
                    break;
                case 5:
                    System.out.println("\n¡Gracias por usar el sistema!");
                    System.out.println("Desarrollado por: Erick Mero, Paola Maldonado, Kevin Cathme");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            if (opcion != 5) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n========== MENÚ PRINCIPAL ==========");
        System.out.println("1. Crear nueva reserva");
        System.out.println("2. Consultar disponibilidad");
        System.out.println("3. Ver habitaciones disponibles");
        System.out.println("4. Información del hotel");
        System.out.println("5. Salir");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearNuevaReserva() {
        System.out.println("\n=== CREAR NUEVA RESERVA ===");

        // Mostrar habitaciones disponibles primero
        hotel.mostrarHabitacionesDisponibles();

        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Número de habitación: ");
        int numeroHab = scanner.nextInt();

        System.out.print("Días de estadía: ");
        int dias = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        hotel.crearReserva(nombre, numeroHab, dias);
    }
}