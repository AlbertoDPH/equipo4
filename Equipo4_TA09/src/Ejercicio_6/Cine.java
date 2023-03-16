package Ejercicio_6;

public class Cine {

	//Attributes
	private Pelicula pelicula;
	private final double PRECIO = 10;
	
	//Constructor
	public Cine(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public Cine() {
		this.pelicula = new Pelicula();
	}

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + PRECIO + "]";
	}

	
}
