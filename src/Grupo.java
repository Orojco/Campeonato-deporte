import java.util.List;

public class Grupo {
    private List<Participante> participantes;

    public Grupo(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public void calcularEstadisticasGrupo() {
        for (Participante participante : participantes) {
            participante.obtenerEstadisticas().actualizarEstadisticas();
        }
    }

    // Getters y setters
    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
}