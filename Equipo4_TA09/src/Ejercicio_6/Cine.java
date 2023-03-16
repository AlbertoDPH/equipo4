package Ejercicio_6;

public class Cine {

	//Attributes
	private Pelicula pelicula;
	private double precio;
	
	//Constructor
	public Cine(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";
	}

	
}
