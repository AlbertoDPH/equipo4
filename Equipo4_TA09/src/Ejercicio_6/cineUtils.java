package Ejercicio_6;

import java.util.ArrayList;

public class cineUtils {

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

	static int[][] sentarEspectadores(int[][] asientos, ArrayList<Espectador> espectadores, Pelicula pelicula, double precio,
			int FILAS, int COLUMNAS) {

		ArrayList<Integer> asienNoUsados = new ArrayList<>();

		// Limpiamos los asientos si hubo una sesion anterior
		asientos = resetEspectadores(asientos, FILAS, COLUMNAS);

		/*
		 * Recorremos la matriz de asientos para buscar los que no hayan sido ocupados
		 * (0) se agragan a la lista los asientos no ocupado
		 */
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {

				/*
				 * Calcula el número de asiento no ocupada i= numero de la fila 9 es el número
				 * de columnas que tiene la matriz j es el número de la columna del asiento no
				 * ocupado. (i*9)Obtenemos la posición inicial del asiento en la fila. Al sumar
				 * j se obtiene la posición final del asiento en esa fila Finalmente esa
				 * posicion se agrega a la lista de asienNoUsados
				 */
				if (asientos[i][j] == 0) {
					int noOupado = i * COLUMNAS + j;
					asienNoUsados.add(noOupado);
				}
			}
		}
		for (Espectador espectador : espectadores) {
			// Recoge la edad del espectador
			int edad = espectador.getEdad();
			// Recoge el dinero que tiene el espectador
			double dinero = espectador.getDinero();

			// Si cumple con los requisitos
			if (dinero >= precio && edad >= pelicula.getEdadMin()) {
				// Numero aleatorio entre todos los asientos no usados
				int aleaNoUsado = (int) (Math.random() * asienNoUsados.size());
				// Asiento libre obtenido del aleatorio
				int asiento = asienNoUsados.get(aleaNoUsado);

				// calcula la fila y la columna de asiento y lo marca como ocupadado (1)
				asientos[asiento / COLUMNAS][asiento % COLUMNAS] = 1;

				// Elimina el asiento usado de la lista asienNoUsados
				asienNoUsados.remove(aleaNoUsado);

				// Sentar espectador
				espectador.setEstaSentado(true);

				// Asigna la posicion al espectador
				espectador.setAsienAsignado(new int[] { asiento / COLUMNAS, asiento % COLUMNAS });
			}
			// Devuelve la matriz asientos con las posiciones de los asientos ocuapados
		}
		return asientos;

	}

	// Funcion que resetea los asientos
	private static int[][] resetEspectadores(int[][] asientos, int FILAS, int COLUMNAS) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				asientos[i][j] = 0;
			}
		}
		return asientos;
	}

}
