package Ejercicio_6;

import java.util.Random;

public class Espectador {

	private String nombre;
	private int edad;
	private double dinero;

	// Constructores
	public Espectador() {
		this.nombre = "Gumersindo";
		this.edad = generadorEdad();
		this.dinero = 10;
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

	private int generadorEdad() {
		int min = 5;
		int max = 80;
		Random edadRandom = new Random();

		int edad = edadRandom.nextInt((max - min) + 1) + min;
		return edad;
	}

}
