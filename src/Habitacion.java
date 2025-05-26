/**
 * Clase Habitacion - Representa una habitación del hotel
 * @author Paola Maldonado
 */
public class Habitacion {
    // Atributos privados (Encapsulación)
    private int numero;
    private String tipo; // "Simple" o "Doble"
    private double precio;
    private boolean disponible;

    // Constructor
    public Habitacion(int numero) {
        this.numero = numero;
        // Asignamos tipo y precio según el número de habitación
        if (numero <= 5) {
            this.tipo = "Simple";
            this.precio = 50.0;
        } else {
            this.tipo = "Doble";
            this.precio = 80.0;
        }
        this.disponible = true; // Por defecto está disponible
    }

    // Constructor con todos los parámetros
    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = true;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;