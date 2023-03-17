package Ejercicio_6;

import java.util.ArrayList;

public class Cine {

	// Tamaño cine
	private final int FILAS = 8;
	private final int COLUMNAS = 9;

	// Atributos
	private int[][] asientos = new int[FILAS][COLUMNAS]; // matriz de 8 filas x 9 columnas
	private Pelicula pelicula;
	private ArrayList<Espectador> espectadores;
	private double precio;

	// Constructor de cine con objeto pelicula, listado de espectadores, y precio de
	// la entrada
	public Cine(Pelicula pelicula, ArrayList<Espectador> espectadores, double precio) {
		// Asigna asientos a la matriz pasando la matriz, la lista de espectadores, la
		// informacion de la pelicula, el precio de la entrada y el tamaño de la sala
		// del cine
		this.asientos = cineUtils.sentarEspectadores(asientos, espectadores, pelicula, precio, FILAS, COLUMNAS);
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

	public Pelicula getPelicula() {
		return pelicula;
	}

	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	// Setters
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	// Al setear nueva lista de espectadores, se vacian y reasignan los asientos
	// igual que en el constructor
	public void setEspectadores(ArrayList<Espectador> espectadores) {
		this.espectadores = espectadores;
		this.asientos = cineUtils.sentarEspectadores(asientos, espectadores, pelicula, precio, FILAS, COLUMNAS);
	}

	// Metodo que muestra una tabla por consola con los asientos ocupados del cine
	public void verAsientosAsignados() {

		char fila = 'A';
		for (int i = 0; i < FILAS; i++) {
			System.out.println("-------------------------------------------");
			System.out.print("Fila " + fila + " ");
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(
						asientos[i][j] == 0 ? "\u001B[32m" + " |\033[4;2m" + " " + "\033[4;0m\u001B[32m|" + "\u001B[37m"
								: "\u001B[31m" + " |\033[4;2m" + "O" + "\033[4;0m\u001B[31m|" + "\u001B[37m");
			}
			System.out.println();
			fila++;
		}
		System.out.println("___________________________________________");
		System.out.println("Columna: 1   2   3   4   5   6   7   8   9 ");
	}

	// Metodo que muestra la pelicula actual
	public void peliculaActual() {
		System.out.println("Pelicula: " + pelicula.getTitulo() + "\n");
	}

}
