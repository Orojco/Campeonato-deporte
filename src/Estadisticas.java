public class Estadisticas {
    private int puntos;
    private int victorias;
    private int derrotas;

    public Estadisticas() {
        this.puntos = 0;
        this.victorias = 0;
        this.derrotas = 0;
    }

    public void actualizarEstadisticas() {
        // Lógica para actualizar estadísticas
    }

    public void actualizarEstadisticas(Estadisticas otras) {
        this.puntos += otras.puntos;
        this.victorias += otras.victorias;
        this.derrotas += otras.derrotas;
    }

    // Getters y setters
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}