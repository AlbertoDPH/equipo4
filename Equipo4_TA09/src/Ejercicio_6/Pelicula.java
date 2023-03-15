package Ejercicio_6;

public class Pelicula {

	protected String titulo;
	protected int duracion;
	protected int edadMin;
	protected String director;

	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director="
				+ director + "]";
	}

}
