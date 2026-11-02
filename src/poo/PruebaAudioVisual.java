package poo;
import uni1a.*;
import ups.poo.contenidoAudiovisual.redesSociales.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // Película con actores (agregación: los actores se crean afuera)
        Pelicula avatar = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor a1 = new Actor("Sam Worthington", "Australia", 48);
        Actor a2 = new Actor("Zoe Saldana", "Estados Unidos", 47);
        avatar.agregarActor(a1);
        avatar.agregarActor(a2);
        contenidos[0] = avatar;

        // Serie con temporadas (composición: la serie las crea)
        SerieDeTV got = new SerieDeTV("Game of Thrones", 60, "Fantasy");
        got.agregarTemporada(1, 10, 2011);
        got.agregarTemporada(2, 10, 2012);
        contenidos[1] = got;

        // Documental con investigador (asociación)
        Documental cosmos = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador inv = new Investigador("Carl Sagan", "Astronomia", "Universidad de Cornell");
        cosmos.setInvestigador(inv);
        contenidos[2] = cosmos;

        // Nuevas subclases (herencia)
        contenidos[3] = new VideoTikTok("Baile viral", 1, "Entretenimiento", "@usuario1", "Sonido original", 15000);
        contenidos[4] = new ReelIg("Receta rapida", 1, "Cocina", "@chef_ec", 8200, "#recetas");

        // Mostrar los detalles de cada contenido (polimorfismo)
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}