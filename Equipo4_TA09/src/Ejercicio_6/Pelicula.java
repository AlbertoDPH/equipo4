package Ejercicio_6;

public class Pelicula {
	
	//Attributes
	protected String titulo;
	protected int duracion;
	protected int edadMinima;
	protected String director;
	
	//Constructor
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	//ToString
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director="
				+ director + "]";
	}	
}
