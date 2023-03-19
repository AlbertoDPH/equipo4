package Ejercicio_5;

import java.util.Random;

class Profesor extends Persona {

	private final double PROBABILIDAD_AUSENTE = 0.2; // 20% posibilidades de ausentarse
	private final String[] MATERIAS = { "MATEMATICAS" };

	// Atributos
	private boolean ausente;
	private String materiaImpartida;

	// Constructores
	// Default
	Profesor() {
		super();
		this.ausente = seAusenta();
		this.materiaImpartida = materiaImpartida;
		this.edad = generadorEdad();
	}

	Profesor(int edad, char genero) {
		super(edad, genero);
		// TODO Auto-generated constructor stub
	}

	Profesor(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	Profesor(String nombre, int edad, char genero) {
		super(nombre, edad, genero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Profesor [ausente=" + ausente + ", materiaImpartida=" + materiaImpartida + ", nombre=" + nombre
				+ ", edad=" + edad + ", genero=" + genero + "]";
	}

	private boolean seAusenta() {
		Random random = new Random();
		boolean seAusenta = random.nextDouble() < PROBABILIDAD_AUSENTE;
		return seAusenta;
	}

	private int generadorEdad() {
		int edadminima = 25;
		int edadmaxima = 65;
		Random random = new Random();
		return random.nextInt(edadmaxima) + edadminima;
	}

}
