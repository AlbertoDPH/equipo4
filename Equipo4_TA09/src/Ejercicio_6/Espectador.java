package Ejercicio_6;

public class Espectador {

	private String nombre;
	private int edad;
	private double dinero;

	// Constructores
	public Espectador() {
		this.nombre = "Gumersindo";
		this.edad = 20;
		this.dinero = 10;
	}

	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	
	// Getters
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

}
