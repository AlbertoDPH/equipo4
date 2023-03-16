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
		this.asientos = sentarEspectadores(espectadores, pelicula);
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
//	public void sentarEspectadores(int[][] asientos, Espectador[] espectadores, Pelicula pelicula) {
	public int[][] sentarEspectadores(Espectador[] espectadores, Pelicula pelicula) {

		int edadEspectador;
		double dineroEspectador;
		double precioPelicula;
		int edadMin;

		precioPelicula = this.precio;
		edadMin = pelicula.getEdadMin();

		for (Object Espectador : espectadores) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 9; j++) {
					edadEspectador = espectadores[j].getEdad();
					dineroEspectador = espectadores[j].getDinero();

					if (asientos[i][j] == 0 && (edadEspectador >= edadMin && dineroEspectador >= precioPelicula)) {

						System.out.print(" " + (asientos[i][j] = 1));

					} else
						System.out.print(" " + (asientos[i][j] = 0));
					if (j == espectadores.length) {
						break;
					}
				}
			}
		}
		return asientos;
	}
}
