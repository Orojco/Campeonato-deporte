import java.util.*;

public class CampeonatoLiga extends Campeonato {
    private List<Participante> clasificacion;

    public CampeonatoLiga(String nombre, Date fechaInicio, Date fechaFin) {
        super(nombre, fechaInicio, fechaFin, "liga");
        this.clasificacion = new ArrayList<>();
    }

    public void calcularClasificacion() {
        clasificacion = new ArrayList<>(getParticipantes());
        Collections.sort(clasificacion, Comparator.comparingInt(p -> -p.obtenerEstadisticas().getPuntos()));
    }

    // Getters y setters
    public List<Participante> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(List<Participante> clasificacion) {
        this.clasificacion = clasificacion;
    }
}