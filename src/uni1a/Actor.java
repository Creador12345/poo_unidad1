package uni1a;

/*
 * Autor: Jhon Zuñiga
 * Fecha: 2/11/2026
 * */

public class Actor {
	private String nombre;
	private String pais;
	private int edad;
	
	//constructor
	public Actor(String nombre, String pais, int edad) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
	}
	
	
    // getters y setters 	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPais() {
		return pais;
	}

      

	public void setPais(String pais) {
		this.pais = pais;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	//datos del actor
	public void mostrarInfo() {
	    System.out.println("EL nombre del actor es: "+nombre);
	    System.out.println("EL país del actor es: "+pais);
	    System.out.println("La edad del actor es: "+edad);
	    
	}
	
	
}    
