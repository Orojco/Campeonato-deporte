import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CampeonatoGrupos extends Campeonato {
    private List<Grupo> grupos;

    public CampeonatoGrupos(String nombre, Date fechaInicio, Date fechaFin) {
        super(nombre, fechaInicio, fechaFin, "grupos");
        this.grupos = new ArrayList<>();
    }

    public void organizarGrupos(int numeroGrupos) {
        List<Participante> participantes = getParticipantes();
        int grupoSize = participantes.size() / numeroGrupos;
        int extra = participantes.size() % numeroGrupos;

        for (int i = 0; i < numeroGrupos; i++) {
            List<Participante> grupoParticipantes = new ArrayList<>(participantes.subList(i * grupoSize, (i + 1) * grupoSize));
            if (i < extra) {
                grupoParticipantes.add(participantes.get(participantes.size() - extra + i));
            }
            grupos.add(new Grupo(grupoParticipantes));
        }
    }

    // Getters y setters
    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}