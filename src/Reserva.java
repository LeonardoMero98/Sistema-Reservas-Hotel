/**
 * Clase Reserva - Gestiona las reservas del hotel
 * @author Kevin Cathme
 */
public class Reserva {
    // Atributos privados (Encapsulación)
    private static int contadorReservas = 1000; // Para generar IDs únicos
    private int idReserva;
    private String nombreCliente;
    private int numeroHabitacion;
    private int diasEstadia;
    private double precioTotal;
    private boolean activa;

    // Constructor
    public Reserva(String nombreCliente, int numeroHabitacion, int diasEstadia, double precioPorDia) {
        this.idReserva = ++contadorReservas;
        this.nombreCliente = nombreCliente;
        this.numeroHabitacion = numeroHabitacion;
        this.diasEstadia = diasEstadia;
        this.precioTotal = diasEstadia * precioPorDia;
        this.activa = true;
    }

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getDiasEstadia() {
        return diasEstadia;
    }

    public void setDiasEstadia(int diasEstadia) {
        this.diasEstadia = diasEstadia;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // Método para mostrar información de la reserva
    public void mostrarInfo() {
        System.out.println("=== RESERVA #" + idReserva + " ===");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Días de estadía: " + diasEstadia);
        System.out.println("Precio total: $" + precioTotal);
        System.out.println("Estado: " + (activa ? "Activa" : "Finalizada"));
        System.out.println("=======================");
    }
}