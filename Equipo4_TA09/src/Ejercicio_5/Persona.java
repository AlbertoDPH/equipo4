package Ejercicio_5;

import java.util.Random;

class Persona {

	// Lista de generos disponibles
	protected final char[] GENEROS_DISPONIBLES = { 'M', 'F' };

	// Atributos
	protected String nombre;
	protected int edad;
	protected char genero;

	// Constructores
	// Constructor por defecto
	public Persona() {
		this.nombre = randomNombre();
		this.edad = 0;
		this.genero = randomGenero();
	}

	// Constructor con todos los parametros, validando el genero
	public Persona(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = validarGenero(genero);
	}

	// Constructor solo con edad
	public Persona(int edad) {
		super();
		this.nombre = randomNombre();
		this.edad = edad;
		this.genero = randomGenero();
	}

	// Constructor solo con edad y genero
	public Persona(int edad, char genero) {
		super();
		this.nombre = randomNombre();
		this.edad = edad;
		this.genero = validarGenero(genero);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getGenero() {
		return genero;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGenero(char genero) {
		this.genero = validarGenero(genero);
	}

	// Funciones
	// Valida el genero introducido
	char validarGenero(char genero) {
		genero = Character.toUpperCase(genero);

		// Si el genero es correcto, lo devuelve
		for (char c : GENEROS_DISPONIBLES) {
			if (c == genero) {
				return genero;
			}
		}

		// Si no, devuelve el genero por defecto hombre
		return 'M';
	}

	// Generador de genero aleatorio
	char randomGenero() {
		Random rand = new Random();
		int index = rand.nextInt(GENEROS_DISPONIBLES.length);
		return GENEROS_DISPONIBLES[index];
	}

	// Generador de nombre aleatorio
	String randomNombre() {
		String[] nombres = { "Gumersindo", "Jose", "Javi", "Alberto", "Maria", "Marta", "Andrea", "Francisco", "Hugo",
				"Lucas", "Alejandra", "Montserrat" };

		Random rand = new Random();

		int indiceRandom = rand.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}

}
