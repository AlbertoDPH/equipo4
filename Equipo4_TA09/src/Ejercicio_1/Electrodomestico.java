package Ejercicio_1;

class Electrodomestico {

	// Por defecto
	private final char[] NIVELES_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };
	private final String[] COLORES_DISPONIBLES = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };

	// Atributos

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	// Constructores

	Electrodomestico() {
		this.precioBase = 100;
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.peso = 5;
	}

	Electrodomestico(double precio, int peso) {
		this.precioBase = precio;
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.peso = peso;
	}

	Electrodomestico(double precio, String color, char consumo, int peso) {
		this.precioBase = precio;
		this.color = color;
		this.consumoEnergetico = consumo;
		this.peso = peso;
	}

	// Getters

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	protected double getPrecioBase() {
		return precioBase;
	}

	protected String getColor() {
		return color;
	}

	protected char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	protected int getPeso() {
		return peso;
	}

	// Setters
	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	protected void setPeso(int peso) {
		this.peso = peso;
	}

	// Metodos

}
