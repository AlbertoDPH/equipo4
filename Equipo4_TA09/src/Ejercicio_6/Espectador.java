package Ejercicio_6;

import java.util.Random;

public class Espectador {

	private String nombre;
	private int edad;
	private double dinero;

	// Constructores
	public Espectador() {
		this.nombre = generadorNombre();
		this.edad = generadorEdad();
		this.dinero = generadorDinero();
	}

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	// Getters
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	// Metodos

	private int generadorEdad() { // Generador de edad aleatoria entre 5 y 80 años
		int min = 5;
		int max = 80;
		Random edadRandom = new Random();

		int edad = edadRandom.nextInt((max - min) + 1) + min;
		return edad;
	}

	private double generadorDinero() { // Generador de dinero aleatorio, entre 0 y 20
		double min = 0;
		double max = 20;
		Random dineroRandom = new Random();

		double dinero = dineroRandom.nextDouble((max - min) + 1) + min;
		dinero = Math.round(dinero * 100.0) / 100.0; // Redondea el resultado a 2 decimales
		return dinero;
	}

	private String generadorNombre() { // Generador de nombres aleatorios definidos en una lista
		String[] nombres = { "Gumersindo", "Jose", "Javi", "Alberto", "Maria", "Marta", "Andrea", "Francisco", "Hugo",
				"Lucas", "Alejandra", "Montserrat" };

		Random rand = new Random();

		int indiceRandom = rand.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}
	
	public Espectador[] generadorEspectadores(int n) {
		
		return;
	}

}
