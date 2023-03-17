package Ejercicio_6;

public class Pelicula {

	// Atributos
	private String titulo;
	private int duracion;
	private int edadMin;
	private String director;

	// Constructor
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

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public String getDirector() {
		return director;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
