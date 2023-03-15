package Ejercicio_6;

import java.util.Arrays;

public class Cine {

	// Atributos
	private final char[] FILAS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

	private int[][] asientos = new int[8][9];
	private String teststring;
	private Pelicula pelicula;
	private Espectador[] espectadores;
	private double precio;

	public Cine(String teststring, Pelicula pelicula, Espectador[] espectadores, double precio) {
		this.asientos = sentarEspectadores(asientos, espectadores);
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

	// Getters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodos
	int[][] sentarEspectadores(int[][] asientos, Espectador[] espectadores) {
		for (Object Espectador : espectadores) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 9; j++) {
					if (asientos[i][j] == 0) {
						asientos[i][j] = 1;
					}
				}
			}
		}
		return asientos;
	}
}
