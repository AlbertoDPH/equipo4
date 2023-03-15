package Ejercicio_6;

import java.util.Arrays;

public class Cine {

	// Atributos
	private final char[] FILAS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

	private String[][] asientos = new String[8][9];
	private String teststring;
	private Pelicula pelicula;
	private Espectador[] espectadores;
	private double precio;

	public Cine(String teststring, Pelicula pelicula, Espectador[] espectadores, double precio) {
		this.teststring = teststring;
		this.pelicula = pelicula;
		this.espectadores = espectadores;
		this.precio = precio;

	}

	@Override
	public String toString() {
		return "Cine [teststring=" + teststring + ", pelicula=" + pelicula + ", espectadores="
				+ Arrays.toString(espectadores) + ", precio=" + precio + "]";
	}

}
