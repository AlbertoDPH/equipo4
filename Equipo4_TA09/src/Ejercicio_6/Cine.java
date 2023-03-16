package Ejercicio_6;

import java.util.ArrayList;

// test

public class Cine {

	// Atributos

	private int[][] asientos = new int[8][9];
	private String teststring;
	private Pelicula pelicula;
	private ArrayList<Espectador> espectadores;
	private double precio;

	public Cine(String teststring, Pelicula pelicula, ArrayList<Espectador> espectadores, double precio) {
		this.asientos = sentarEspectadores(asientos, espectadores);
		this.teststring = teststring;
		this.pelicula = pelicula;
		this.espectadores = espectadores;
		this.precio = precio;

	}

	// Getters
	@Override
	public String toString() {
		return "Cine [teststring=" + teststring + ", pelicula=" + pelicula + ", espectadores=" + espectadores
				+ ", precio=" + precio + "]";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodos
	int[][] sentarEspectadores(int[][] asientos, ArrayList<Espectador> espectadores) {
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
