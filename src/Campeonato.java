import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String sistema; // "liga", "muerteSubita", "grupos"
    private List<Participante> participantes;

    public Campeonato(String nombre, Date fechaInicio, Date fechaFin, String sistema) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sistema = sistema;
        this.participantes = new ArrayList<>();
    }

    public void inscribirParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void calcularEstadisticas() {
        for (Participante participante : participantes) {
            participante.obtenerEstadisticas().actualizarEstadisticas();
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}