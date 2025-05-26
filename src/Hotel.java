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