import java.util.Date;
import java.util.List;

public class CampeonatoMuerteSubita extends Campeonato {
    private int rondaActual;

    public CampeonatoMuerteSubita(String nombre, Date fechaInicio, Date fechaFin) {
        super(nombre, fechaInicio, fechaFin, "muerteSubita");
        this.rondaActual = 1;
    }

    public void avanzarRonda() {
        List<Participante> participantes = getParticipantes();
        if (participantes.size() > 1) {
            participantes.removeIf(p -> p.obtenerEstadisticas().getDerrotas() > 0);
            rondaActual++;
        }
    }

    // Getters y setters
    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }
}