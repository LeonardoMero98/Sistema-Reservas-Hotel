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
}