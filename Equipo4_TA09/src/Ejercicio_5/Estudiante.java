package Ejercicio_5;

import java.util.Random;

class Estudiante extends Persona implements Asistencia {

	private final double PROBABILIDAD_NOVILLOS = 0.5; // 50% posibilidades de ausentarse
	private static final int MAX_CALIFICACION = 100;
	private static final int MIN_CALIFICACION = 0;

	// Atributos
	private boolean ausente;
	private int calificacion;

	// Constructores
	Estudiante() {
		super(generadorEdad());
		this.ausente = seAusenta();
		this.calificacion = generadorCalificacion();
	}

	// Funcion que decide si el estudiante esta ausenta con 50% de posibilidades
	public boolean seAusenta() {
		Random random = new Random();
		boolean seAusenta = random.nextDouble() < PROBABILIDAD_NOVILLOS;
		return seAusenta;
	}

	// Funcion que genera calificacion de estudiante aleatoria
	public int generadorCalificacion() {
		Random random = new Random();
		return random.nextInt(MAX_CALIFICACION) + MIN_CALIFICACION;
	}

	@Override
	// Funcion que genera edad de estudiante aleatoria
	public int generadorEdad() {
		int edadminima = 10;
		int edadmaxima = 17;
		Random random = new Random();
		return random.nextInt(edadmaxima) + edadminima;
	}

}
