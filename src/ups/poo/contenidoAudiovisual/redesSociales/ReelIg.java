package ups.poo.contenidoAudiovisual.redesSociales;
import uni1a.*;

public class ReelIg extends ContenidoAudiovisual {
	private String cuenta;
	private int cantidadVistas;
	private String hashtag;

	//Constructor
	public ReelIg(String titulo, int duracionEnMinutos, String genero,
	              String cuenta, int cantidadVistas, String hashtag) {
		super(titulo, duracionEnMinutos, genero);
		this.cuenta = cuenta;
		this.cantidadVistas = cantidadVistas;
		this.hashtag = hashtag;
	}

	//getters y setters
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public int getCantidadVistas() {
		return cantidadVistas;
	}

	public void setCantidadVistas(int cantidadVistas) {
		this.cantidadVistas = cantidadVistas;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Reel de Instagram:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Cuenta: " + cuenta);
		System.out.println("Vistas: " + cantidadVistas);
		System.out.println("Hashtag: " + hashtag);
		System.out.println();
	}
}