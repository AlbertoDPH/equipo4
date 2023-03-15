package Ejercicio_1;

public class Television extends Electrodomestico {
	
	private double resolucion;
	private boolean sintonizador;
	
	//Constructors
	public Television() {
		super();
		this.resolucion = 0;
		this.sintonizador = false;
	}
	
	public Television(double resolucion, boolean sintonizador) {
		super();
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	public Television(double precio, int peso) {
		super(precio, peso);
		this.resolucion = 0;
		this.sintonizador = false;
	}
	
	public Television(double precio, String color, char consumo, int peso, double resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	//Methods
	public static double precioFinal(double resolucion, boolean sintonizador, double precio) {
		if(resolucion >= 40) {
			precio += (precio * 0.30);
		}
		if (sintonizador) {
			precio += 50;
		}
		return precio;
	}
	
	//Getters
	public double getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizador() {
		return sintonizador;
	}
	
	//ToString
	public String toSring() {
		return "Television [resolución=" + resolucion + ", sintonizador= " + sintonizador +  ", precioBase=" + precioBase + ", color=" 
				+ color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
