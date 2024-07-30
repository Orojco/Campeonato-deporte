public abstract class Participante {
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public abstract Estadisticas obtenerEstadisticas();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}