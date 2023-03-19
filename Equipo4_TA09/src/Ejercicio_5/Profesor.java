package Ejercicio_5;

import java.util.Random;

class Profesor extends Persona {

	private final double PROBABILIDAD_AUSENTE = 0.2; // 20% posibilidades de ausentarse
	private final String[] MATERIAS = { "MATEMATICAS", "FILOSOFIA", "FISICA" };
	private final String MATERIA_DEFAULT = "MATEMATICAS";

	// Atributos
	private boolean ausente;
	private String materiaImpartida;

	// Constructores
	// Default
	Profesor() {
		super();
		this.ausente = seAusenta();
		this.materiaImpartida = asignadorMateriaAleatorio();
		this.edad = generadorEdad();
	}

	Profesor(String materiaImpartida) {
		super();
		this.ausente = seAusenta();
		this.materiaImpartida = validadorDeMateria(materiaImpartida);
		this.edad = generadorEdad();
	}

	Profesor(String nombre, int edad, char genero, String materiaImpartida) {
		super(nombre, edad, genero);
		this.ausente = seAusenta();
		this.materiaImpartida = validadorDeMateria(materiaImpartida);
	}

	@Override
	public String toString() {
		return "Profesor " + nombre + " con " + edad + " años de edad y genero " + genero + ", imparte "
				+ materiaImpartida + ". Esta absente hoy? " + ausente;
	}

	// Getters
	public String getMateriaImpartida() {
		return materiaImpartida;
	}

	// Setters
	public void setMateriaImpartida(String materiaImpartida) {
		this.materiaImpartida = validadorDeMateria(materiaImpartida);
	}

	// Genera si el profesor se ausenta con un 20% de probabilidades
	private boolean seAusenta() {
		Random random = new Random();
		boolean seAusenta = random.nextDouble() < PROBABILIDAD_AUSENTE;
		return seAusenta;
	}

	// Generador de edad entre 25 y 65 años
	private int generadorEdad() {
		int edadminima = 25;
		int edadmaxima = 65;
		Random random = new Random();
		return random.nextInt((edadmaxima - edadminima) + 1) + edadminima;
	}

	// Funcion que comprueba que la materia introducida sea valida
	private String validadorDeMateria(String materia) {
		materia.toUpperCase();
		for (String m : MATERIAS) {
			if (materia.equals(m)) {
				return materia;
			}
		}
		return MATERIA_DEFAULT;
	}

	// Funcion que asigna materia aleatoria
	private String asignadorMateriaAleatorio() {
		Random rand = new Random();
		int index = rand.nextInt(MATERIAS.length);
		return MATERIAS[index];
	}

}
