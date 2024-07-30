public class Deporte {
    private String nombre;
    private String tipo; // "equipo" o "individual"

    public Deporte(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public boolean esDeporteEquipo() {
        return tipo.equalsIgnoreCase("equipo");
    }

    public boolean esDeporteIndividual() {
        return tipo.equalsIgnoreCase("individual");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}