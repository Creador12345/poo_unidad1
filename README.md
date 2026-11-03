# Prueba audio visual

## Objetivo y propósito
Crear 3 clases: Actor, Temporada e Investigador. Además, agregar 2 clases más de forma creativa, con el fin de comprender y usar los conceptos de: herencia, asociación, agregación y composición.

## Clases nuevas y funcionalidades
- **Actor:** permite crear varios actores. Se relaciona con Pelicula por agregación.
- **Temporada:** permite poner el número de temporadas que tiene una serie, la cantidad de episodios y el año de estreno. Se relaciona con SerieDeTV por composición.
- **Investigador:** permite asignar un investigador con su nombre, especialidad e institución, de ser necesario. Se relaciona con Documental por asociación.
- **VideoTikTok:** hereda de ContenidoAudiovisual. Permite ver el usuario, la cantidad de likes y la música utilizada en el video.
- **ReelIg:** hereda de ContenidoAudiovisual. Permite ver la cuenta, la cantidad de vistas y el hashtag de un video.

## Cómo clonar y ejecutar
1. File
2. Import
3. Git
4. Projects from Git
5. Clone URI
6. Poner la URL: https://github.com/Creador12345/poo_unidad1.git
7. Abrir la clase PruebaAudioVisual y ejecutarla con Run

## Mejoras adicionales
1. Polimorfismo en el main
2. Manejo de null en mostrarDetalles