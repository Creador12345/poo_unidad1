/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private ArrayList<Temporada> temporadas; // Composición
	public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    // La serie CREA sus temporadas 
    public void agregarTemporada(int numero, int cantidadEpisodios, int anioEstreno) {
        temporadas.add(new Temporada(numero, cantidadEpisodios, anioEstreno));
    }

    public int getCantidadTemporadas() {
        return temporadas.size();
    }     

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas.size());
        for (Temporada t : temporadas) {
            System.out.print("  - ");
            t.mostrarInfo();
        }
        System.out.println();
    }
}