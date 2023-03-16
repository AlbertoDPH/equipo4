package Ejercicio_6;

import java.util.ArrayList;

// test

public class Cine {

	// Atributos

	private int[][] asientos = new int[8][9];
	private Pelicula pelicula;
	private ArrayList<Espectador> espectadores;
	private double precio;

	public Cine(String teststring, Pelicula pelicula, ArrayList<Espectador> espectadores, double precio) {
		this.asientos = sentarEspectadores(asientos, espectadores, pelicula);
		this.pelicula = pelicula;
		this.espectadores = espectadores;
		this.precio = precio;
	}

	// Getters
	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", espectadores=" + espectadores + ", precio=" + precio + "]";
	}

	public int[][] getAsientos() {
		return asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodos
	int[][] sentarEspectadores(int[][] asientos, ArrayList<Espectador> espectadores, Pelicula pelicula) {
		for (Espectador Espectador : espectadores) {
			int edad = Espectador.getEdad();
			double dinero = Espectador.getDinero();
			if (dinero >= this.getPrecio() && edad >= pelicula.getEdadMin())
				loopvector: for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 9; j++) {
						if (asientos[i][j] == 0) {
							asientos[i][j] = 1;
							break loopvector;
						}
					}
				}
		}
		return asientos;
	}

	public void verAsientosAsignados() {
		char fila = 'A';
		for (int i = 0; i < 8; i++) {
			System.out.print("Fila " + fila + " ");
			for (int j = 0; j < 9; j++) {
				System.out.print(asientos[i][j] + " ");
			}
			System.out.println();
			fila++;
		}
	}
}
