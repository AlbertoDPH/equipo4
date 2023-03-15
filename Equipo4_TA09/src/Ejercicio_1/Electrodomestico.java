package Ejercicio_1;

class Electrodomestico {

	// Por defecto
	private final char[] NIVELES_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };
	private final String[] COLORES_DISPONIBLES = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };
	private final char CONSUMO_DEFAULT = 'F';
	private final String COLOR_DEFAULT = "BLANCO";

	// Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	// Constructores
	Electrodomestico() {
		this.precioBase = 100;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
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
		this.color = validarColor(color);
		this.consumoEnergetico = validarConsumo(consumo);
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
		this.color = validarColor(color);
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = validarConsumo(consumoEnergetico);
	}

	protected void setPeso(int peso) {
		this.peso = peso;
	}

	// Metodos
	public String validarColor(String color) {
		color = color.toUpperCase();
		for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
			if (color.equals(COLORES_DISPONIBLES[i])) {
				return color;
			}
		}
		return COLOR_DEFAULT;
	}

	public char validarConsumo(char consumo) {
		consumo = Character.toUpperCase(consumo);
		for (int i = 0; i < NIVELES_CONSUMO.length; i++) {
			if (Character.compare(consumo, NIVELES_CONSUMO[i]) == 0) {
				return consumo;
			}
		}
		return CONSUMO_DEFAULT;
	}

}
