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
		this.asientos = sentarEspectadores(asientos, espectadores, pelicula, precio); // asigna espectadores a sus
																						// asientos
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
		this.asientos = sentarEspectadores(asientos, espectadores, pelicula, precio);
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
	private int[][] sentarEspectadores(int[][] asientos, ArrayList<Espectador> espectadores, Pelicula pelicula,
			double precio) {
		ArrayList<Integer> asienNoUsados = new ArrayList<>();

		// Limpiamos los asientos si hubo una sesion anterior
		asientos = resetEspectadores(asientos);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				/*
				 * Recorremos la matriz de asientos para buscar los que no hayan sido ocupados
				 * (0) se agragan a la lista los asientos no ocupado
				 */

				if (asientos[i][j] == 0) {
					int noOupado = i * COLUMNAS + j;
					asienNoUsados.add(noOupado);
				}
			}
		}
		for (Espectador espectador : espectadores) {
			int edad = espectador.getEdad();
			double dinero = espectador.getDinero();
			if (dinero >= precio && edad >= pelicula.getEdadMin()) {

				// Numero aleatorio entre todos los asientos no usados
				int aleaNoUsado = (int) (Math.random() * asienNoUsados.size());
				// Asiento libre obtenido del aleatorio
				int asiento = asienNoUsados.get(aleaNoUsado);

				// calcula la fila y la columna de asiento y lo marca como ocupdado (1)
				asientos[asiento / COLUMNAS][asiento % COLUMNAS] = 1;

				// Elimina el asiento usado de la lista asienNoUsados
				asienNoUsados.remove(aleaNoUsado);

				// Setar espectador
				espectador.setEstaSentado(true);

				// Asigna la posicion al espectador
				espectador.setAsienAsignado(new int[] { asiento / 9, asiento % 9 });
			}
		}
		return asientos;

	}

	// Funcion que resetea los asientos
	private int[][] resetEspectadores(int[][] asientos) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				asientos[i][j] = 0;
			}
		}
		return asientos;
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
