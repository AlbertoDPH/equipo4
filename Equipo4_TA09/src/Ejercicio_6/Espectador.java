package Ejercicio_6;

public class Espectador {

	//Attributes
	private String nombre;
	private int edad;
	private double dinero;
	
	//Constructors
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public double getDinero() {
		return dinero;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
	
}
