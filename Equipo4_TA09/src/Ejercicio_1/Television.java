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
	
	public Television(doble precio, String color, char consumo, int peso, double resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	//Methods
	
	//ToString
	
}
