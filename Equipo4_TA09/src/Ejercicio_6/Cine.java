package Ejercicio_6;

import java.util.ArrayList;

public class Cine {

	// Atributos

	private int[][] asientos = new int[8][9]; // matriz de 8 filas x 9 columnas
	private Pelicula pelicula;
	private ArrayList<Espectador> espectadores;
	private double precio;

	// Constructor de cine con objeto pelicula, listado de espectadores, y precio de
	// la entrada
	public Cine(Pelicula pelicula, ArrayList<Espectador> espectadores, double precio) {
		this.asientos = sentarEspectadores(asientos, espectadores, pelicula); // asigna espectadores a sus asientos
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

	public void setEspectadores(ArrayList<Espectador> espectadores) {
		this.espectadores = espectadores;
	}

	// Metodos
	// Metodo que devuelve un vector de 2 direcciones con los asientos ocupados
	// 1 es ocupado, 0 es libre
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

	// Metodo que muestra una tabla por consola con los asientos ocupados del cine
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

	// Metodo que muestra la pelicula actual
	public void peliculaActual() {
		System.out.println("La pelicula actual es: " + pelicula.getTitulo());
	}
}
