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
	/**
	 * Método que devuelve una matriz con los asientos ocupados de una sala de cine
	 * de 8 * 9
	 * 
	 * @param asientos     matriz que le pasamos por parametro que se llenara de
	 *                     0(libre) 1(ocupado)
	 * @param espectadores le pasamos el ArrayList con los espetadores
	 * @param pelicula     Le pasamos los datos del objeto pelicula que usaremos
	 *                     para controlar la edadMin
	 * @return devuleve la matriz con los asientos ocupados
	 */
	int[][] sentarEspectadores(int[][] asientos, ArrayList<Espectador> espectadores, Pelicula pelicula) {
		ArrayList<Integer> asienNoUsados = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				/*
				 * Recorremos la matriz de asientos para buscar los que no hayan sido ocupados
				 * (0) se agragan a la lista los asientos no ocupado
				 */

				if (asientos[i][j] == 0) {
					int noOupado = i * 9 + j;
					asienNoUsados.add(noOupado);
				}
			}
		}
		for (Espectador espectador : espectadores) {
			int edad = espectador.getEdad();
			double dinero = espectador.getDinero();
			if (dinero >= this.getPrecio() && edad >= pelicula.getEdadMin()) {

				// Numero aleatorio entre todos los asientos no usados
				int aleaNoUsado = (int) (Math.random() * asienNoUsados.size());
				// Asiento libre obtenido del aleatorio
				int asiento = asienNoUsados.get(aleaNoUsado);

				// calcula la fila y la columna de asiento y lo marca como ocupdado (1)
				asientos[asiento / 9][asiento % 9] = 1;

				// Elimina el asiento usado de la lista asienNoUsados
				asienNoUsados.remove(aleaNoUsado);

				// Setar espectador
				espectador.setEstaSentado(true);

				//Asigna la posicion al espectador
				espectador.setAsienAsignado(new int[] { asiento / 9, asiento % 9 });
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
				if (asientos[i][j] == 1)
					// Si es asiento ocupado pinta el asiento en rojo
					System.out.print("\u001B[41m" + asientos[i][j] + "\u001B[0m" + " ");
				else
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
