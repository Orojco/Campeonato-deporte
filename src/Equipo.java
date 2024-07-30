import java.util.ArrayList;
import java.util.List;

public class Equipo extends Participante {
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        super(nombre);
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public Estadisticas obtenerEstadisticas() {
        Estadisticas estadisticasEquipo = new Estadisticas();
        for (Jugador jugador : jugadores) {
            estadisticasEquipo.actualizarEstadisticas(jugador.obtenerEstadisticas());
        }
        return estadisticasEquipo;
    }

    // Getters y setters
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}