package Ejercicio_1;

class Lavadora extends Electrodomestico {

	private int CARGA;

	// Constructores por defecto
	public Lavadora() {
		super();
		this.CARGA = 5;
	}

	//Constructor con precio y peso los demás atributos por ddefecto
	public Lavadora(double precio, int peso) {
		super(precio, peso);
		this.CARGA = 5;
	}

	//Constructor con todos los valores heredado y propios
	public Lavadora(double precio, String color, char consumo, int peso, int CARGA) {
		super(precioFinal(CARGA, precio), color, consumo, peso);
		// TODO Auto-generated constructor stub
		this.CARGA = CARGA;
	}

	// Metodos
	
	/**
	 * Método que calcula el precioFinal 
	 * @param CARGA
	 * @param precio
	 * @return
	 */
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
