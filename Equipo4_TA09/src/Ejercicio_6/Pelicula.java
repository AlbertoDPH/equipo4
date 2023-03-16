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

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @return the edadMin
	 */
	public int getEdadMin() {
		return edadMin;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @param edadMin the edadMin to set
	 */
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	

}
