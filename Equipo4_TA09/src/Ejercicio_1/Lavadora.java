package Ejercicio_1;

class Lavadora extends Electrodomestico {

	private int CARGA;

	// Constructores
	public Lavadora() {
		super();
		this.CARGA = 5;
	}

	public Lavadora(double precio, int peso) {
		super(precio, peso);
		this.CARGA = 5;
	}

	public Lavadora(double precio, String color, char consumo, int peso, int CARGA) {
		super(precioFinal(CARGA, precio), color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.CARGA = CARGA;
	}

	// Metodos
	public static double precioFinal(int CARGA, double precio) {

		if (CARGA > 30) {
			precio += 50;
		}

		return precio;
	}

	// Getters
	public int getCARGA() {
		return CARGA;
	}

	//Metodo ToString
	@Override
	public String toString() {
		return "Lavadora [CARGA=" + CARGA + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
