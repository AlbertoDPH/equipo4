package Ejercicio_6;

public class Cine {

	// Atributos
	private String[][] asientos = new String[8][9];
	private String teststring;
	private Pelicula pelicula;
	private double precio;

	public Cine(String teststring, Pelicula pelicula, double precio) {
		this.teststring = teststring;
		this.pelicula = pelicula;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cine [teststring=" + teststring + ", pelicula=" + pelicula + ", precio=" + precio + "]";
	}

}
