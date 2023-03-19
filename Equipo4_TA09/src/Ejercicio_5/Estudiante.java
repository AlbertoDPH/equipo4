package Ejercicio_5;

import java.util.Random;

class Estudiante extends Persona implements Asistencia {

	private final double PROBABILIDAD_NOVILLOS = 0.5; // 50% posibilidades de ausentarse
	private final int MAX_CALIFICACION = 100;
	private final int MIN_CALIFICACION = 0;

	// Atributos
	private boolean ausente;
	private int calificacion;

	// Constructores

	@Override
	public boolean seAusenta() {
		Random random = new Random();
		boolean seAusenta = random.nextDouble() < PROBABILIDAD_NOVILLOS;
		return seAusenta;
	}

	@Override
	public int generadorEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
