import java.util.ArrayList;

/**
 * Clase Hotel - Gestiona las habitaciones y reservas del hotel
 * @author Erick Mero
 */
public class Hotel {
    // Atributos (Encapsulación - privados)
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    // Constructor
    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
        inicializarHabitaciones();
    }

    // Método para inicializar algunas habitaciones de ejemplo
    private void inicializarHabitaciones() {
        // Creamos 10 habitaciones de ejemplo
        for (int i = 1; i <= 10; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    // Getters y Setters (Encapsulación)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    // Método para agregar una habitación
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para mostrar información del hotel
    public void mostrarInfo() {
        System.out.println("=== HOTEL " + nombre.toUpperCase() + " ===");
        System.out.println("Total de habitaciones: " + habitaciones.size());
        System.out.println("Total de reservas: " + reservas.size());
    }

    // Método para buscar habitación por número (agregado por Paola)
    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNumero() == numero) {
                return hab;
            }
        }
        return null;
    }

    // Método para crear una nueva reserva (agregado por Erick)
    public boolean crearReserva(String nombreCliente, int numeroHabitacion, int diasEstadia) {
        // Buscar la habitación
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);

        // Verificar si existe y está disponible
        if (habitacion == null) {
            System.out.println("ERROR: La habitación " + numeroHabitacion + " no existe.");
            return false;
        }

        if (!habitacion.isDisponible()) {
            System.out.println("ERROR: La habitación " + numeroHabitacion + " no está disponible.");
            return false;
        }

        // Crear la reserva
        Reserva nuevaReserva = new Reserva(nombreCliente, numeroHabitacion,
                diasEstadia, habitacion.getPrecio());

        // Agregar la reserva a la lista
        reservas.add(nuevaReserva);

        // Marcar la habitación como no disponible
        habitacion.setDisponible(false);

        System.out.println("¡Reserva creada exitosamente!");
        nuevaReserva.mostrarInfo();

        return true;
    }

    // Método para consultar disponibilidad de habitaciones (agregado por Paola)
    public void consultarDisponibilidad() {
        System.out.println("\n=== DISPONIBILIDAD DE HABITACIONES ===");

        int disponibles = 0;
        int ocupadas = 0;

        for (Habitacion hab : habitaciones) {
            if (hab.isDisponible()) {
                disponibles++;
                System.out.println("✓ " + hab.toString() + " - DISPONIBLE");
            } else {
                ocupadas++;
            }
        }

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Habitaciones disponibles: " + disponibles);
        System.out.println("Habitaciones ocupadas: " + ocupadas);
        System.out.println("Total de habitaciones: " + habitaciones.size());
        System.out.println("=====================================\n");
    }

    // Método para mostrar solo habitaciones disponibles (agregado por Paola)
    public void mostrarHabitacionesDisponibles() {
        System.out.println("\n=== HABITACIONES DISPONIBLES ===");
        boolean hayDisponibles = false;

        for (Habitacion hab : habitaciones) {
            if (hab.isDisponible()) {
                hab.mostrarInfo();
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay habitaciones disponibles en este momento.");
        }
        System.out.println("================================\n");
    }
}