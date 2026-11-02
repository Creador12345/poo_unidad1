package uni1a;

/*
 * Autor: Jhon Zuñiga
 * Fecha: 2/11/2026
 * */

public class Temporada {
	private int numero;
	private int cantidadEpisodios;
	private int anioEstreno;
	
	//constructor
	Temporada(int numero, int cantidadEpisodios, int anioEstreno) {
		super();
		this.numero = numero;
		this.cantidadEpisodios = cantidadEpisodios;
		this.anioEstreno = anioEstreno;
	}

	//getters y setters     
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCantidadEpisodios() {
		return cantidadEpisodios;
	}

	public void setCantidadEpisodios(int cantidadEpisodios) {
		this.cantidadEpisodios = cantidadEpisodios;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int añoEstreno) {
		this.anioEstreno = añoEstreno;
	}
	
	//mostrar la información de la temporada
	public void mostrarInfo() {
		System.out.println("El número de temporadas es: "+numero);
		System.out.println("La cantidad de episodios es: "+cantidadEpisodios);
		System.out.println("El año de estreño es: "+anioEstreno);
		
	}
	
	
	     
	

}
