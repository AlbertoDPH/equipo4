package Ejercicio_6;

public class Cine {

	// Atributos
	private final char[] FILAS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

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
