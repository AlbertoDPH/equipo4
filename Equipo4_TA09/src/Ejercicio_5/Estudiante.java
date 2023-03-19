package Ejercicio_5;

import java.util.Random;

class Estudiante extends Persona {

	private final double PROBABILIDAD_NOVILLOS = 0.5; // 50% posibilidades de ausentarse
	private static final int MAX_CALIFICACION = 100;
	private static final int MIN_CALIFICACION = 0;

	// Atributos
	private boolean ausente;
	private int calificacion;

	// Constructores
	// Default autogenerado
	Estudiante() {
		super();
		this.edad = generadorEdad();
		this.ausente = seAusenta();
		this.calificacion = generadorCalificacion();
	}

	// Calificacion manual
	Estudiante(int calificacion) {
		super();
		this.edad = generadorEdad();
		this.ausente = seAusenta();
		this.calificacion = calificacion;
	}

	// Todos los campos
	Estudiante(String nombre, int edad, char genero, int calificacion) {
		super(nombre, edad, genero);
		this.ausente = seAusenta();
		this.calificacion = calificacion;
	}

	// toString
	@Override
	public String toString() {
		return "Estudiante [ausente=" + ausente + ", calificacion=" + calificacion + ", nombre=" + nombre + ", edad="
				+ edad + ", genero=" + genero + "]";
	}

	// Getters
	public boolean isAusente() {
		return ausente;
	}

	public int getCalificacion() {
		return calificacion;
	}

	// Setters
	public void setAusente(boolean ausente) {
		this.ausente = ausente;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	// Funciones
	// Funcion que decide si el estudiante esta ausenta con 50% de posibilidades
	private boolean seAusenta() {
		Random random = new Random();
		boolean seAusenta = random.nextDouble() < PROBABILIDAD_NOVILLOS;
		return seAusenta;
	}

	// Funcion que genera calificacion de estudiante aleatoria
	private int generadorCalificacion() {
		Random random = new Random();
		return random.nextInt(MAX_CALIFICACION) + MIN_CALIFICACION;
	}

	// Funcion que genera edad de estudiante aleatoria
	private int generadorEdad() {
		int edadminima = 10;
		int edadmaxima = 17;
		Random random = new Random();
		return random.nextInt((edadmaxima - edadminima) + 1) + edadminima;
	}

}
