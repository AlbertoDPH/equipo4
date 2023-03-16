package Ejercicio_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Espectador {

	// Atributos
	private String nombre;
	private int edad;
	private double dinero;
	private boolean estaSentado;
	private int[] asienAsignado;

	// Constructor por defecto, generando un espectador aleatorio
	public Espectador() {
		this.nombre = generadorNombre();
		this.edad = generadorEdad();
		this.dinero = generadorDinero();
		this.estaSentado = false;
		this.asienAsignado = new int[] { 0, 0 };

	}

	// Constructor para generar espectador especifico
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.estaSentado = false;
		this.asienAsignado = new int[] { 0, 0 };
	}

	// Getters
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", estaSentado=" + estaSentado
				+ ", asienAsignado=" + Arrays.toString(asienAsignado) + "]";
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

	public boolean getEstaSentado() {
		return estaSentado;
	}

	public int[] getAsienAsignado() {
		return asienAsignado;
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

	public void setEstaSentado(boolean estaSentado) {
		this.estaSentado = estaSentado;
	}

	public void setAsienAsignado(int[] asienAsignado) {
		this.asienAsignado = asienAsignado;
	}

	// Metodos
	// Generador de Edad aleatorio
	private int generadorEdad() { // Generador de edad aleatoria entre 5 y 80 años
		int min = 5;
		int max = 80;
		Random edadRandom = new Random();

		int edad = edadRandom.nextInt((max - min) + 1) + min;
		return edad;
	}

	// Generador de Dinero aleatorio
	private double generadorDinero() { // Generador de dinero aleatorio, entre 0 y 20
		double min = 0;
		double max = 20;
		Random dineroRandom = new Random();

		double dinero = dineroRandom.nextDouble((max - min) + 1) + min;
		dinero = Math.round(dinero * 100.0) / 100.0; // Redondea el resultado a 2 decimales
		return dinero;
	}

	// Generador de nombre aleatorio
	private String generadorNombre() { // Generador de nombres aleatorios definidos en una lista
		String[] nombres = { "Gumersindo", "Jose", "Javi", "Alberto", "Maria", "Marta", "Andrea", "Francisco", "Hugo",
				"Lucas", "Alejandra", "Montserrat" };

		Random rand = new Random();

		int indiceRandom = rand.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}

	// Generador de espectadores, devolviendo una arraylist con tantos espectadores
	// como se especifique
	public static ArrayList<Espectador> generadorEspectadores(int n) {
		ArrayList<Espectador> espectadores = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Espectador espectador = new Espectador();
			espectadores.add(espectador);
		}
		return espectadores;
	}

}
