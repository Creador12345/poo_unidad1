package uni1a;

/*
 * Autor: Jhon Zuñiga
 * Fecha: 2/11/2026
 * */

public class Investigador {
	private String nombre;
	private String especialidad;
	private String institucion;
	
	//constructor
	public Investigador(String nombre, String especialidad, String institucion) {
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.institucion = institucion;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
	public void mostrarInfo() {
		System.out.println("El nombre del investigador es: "+nombre);
		System.out.println("La especialidad del investigador es: "+especialidad);
		System.out.println("La institución del investigador es: "+institucion);
	}
	
}
