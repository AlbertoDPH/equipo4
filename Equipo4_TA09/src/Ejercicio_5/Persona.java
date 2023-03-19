package Ejercicio_5;

import java.util.Random;

class Persona {

	protected final char[] GENEROS_DISPONIBLES = { 'M', 'F' };

	// Atributos
	protected String nombre;
	protected int edad;
	protected char genero;

	// Constructores
	public Persona() {
		this.nombre = randomNombre();
		this.edad = 20;
		this.genero = 'M';
	}

	public Persona(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	String randomNombre() {
		String[] nombres = { "Gumersindo", "Jose", "Javi", "Alberto", "Maria", "Marta", "Andrea", "Francisco", "Hugo",
				"Lucas", "Alejandra", "Montserrat" };

		Random rand = new Random();

		int indiceRandom = rand.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}

}
