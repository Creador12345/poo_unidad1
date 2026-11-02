package ups.poo.contenidoAudiovisual.redesSociales;
import uni1a.*;

/*
 * Autor: Jhon Zuñiga
 * Fecha: 2/11/2026
 * */

public class VideoTikTok extends ContenidoAudiovisual  {
private String usuario;
private int cantidadLikes;
private String sonido;

//constructor
public VideoTikTok(String titulo, int duracionEnMinutos, String genero, String usuario, String sonido, int cantidadLikes) {
	super(titulo, duracionEnMinutos, genero);
	this.usuario = usuario;
	this.cantidadLikes = cantidadLikes;
	this.sonido = sonido;
}

//getters y setters    
public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public int getCantidadLikes() {
	return cantidadLikes;
}

public void setCantidadLikes(int catidadLikes) {
	this.cantidadLikes = catidadLikes;
}

public String getSonido() {
	return sonido;
}

public void setSonido(String sonido) {
	this.sonido = sonido;
}

@Override
public void mostrarDetalles() {
	System.out.println("El usuario es: "+usuario);
	System.out.println("La cantidad de likes es : "+cantidadLikes);
	System.out.println("La música es : "+sonido);
}

}