package Ejercicio_5;

import java.util.Random;

class Profesor extends Persona {

	private final double PROBABILIDAD_AUSENTE = 0.2; // 20% posibilidades de ausentarse

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

	// Constructor con materia
	Profesor(String materiaImpartida) {
		super();
		this.ausente = seAusenta();
		this.materiaImpartida = aulaUtils.validadorDeMateria(materiaImpartida);
		this.edad = generadorEdad();
	}

	// Constructor con todos los campos
	Profesor(String nombre, int edad, char genero, String materiaImpartida) {
		super(nombre, edad, genero);
		this.ausente = seAusenta();
		this.materiaImpartida = aulaUtils.validadorDeMateria(materiaImpartida);
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

	public boolean isAusente() {
		return ausente;
	}

	// Setters
	public void setMateriaImpartida(String materiaImpartida) {
		this.materiaImpartida = aulaUtils.validadorDeMateria(materiaImpartida);
	}

	public void setAusente(boolean ausente) {
		this.ausente = ausente;
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

	// Funcion que asigna materia aleatoria
	private String asignadorMateriaAleatorio() {
		Random rand = new Random();
		int index = rand.nextInt(aulaUtils.MATERIAS.length);
		return aulaUtils.MATERIAS[index];
	}

}
