package Ejercicio_1;

class ejercicio1_App {

	public static void main(String[] args) {

		// Comprobaciones Electrodomestico
		// Constructor por defecto
		Electrodomestico e1 = new Electrodomestico();
		System.out.println(e1.toString());

		// Constructor precio y peso
		Electrodomestico e2 = new Electrodomestico(99.99, 10);
		System.out.println(e2.toString());

		// Constructor atributos correctos
		Electrodomestico e3 = new Electrodomestico(80, "negro", 'B', 15);
		System.out.println(e3.toString());

		// Constructor color erroneo
		Electrodomestico e4 = new Electrodomestico(25, "purpura", 'A', 5);
		System.out.println(e4.toString());

		// Constructor eficiencia erronea
		Electrodomestico e5 = new Electrodomestico(50, "gris", 'Z', 7);
		System.out.println(e5.toString());

		// Comprobacion setters con valores erroneos
		e3.setConsumoEnergetico('Z');
		e3.setColor("magenta");
		System.out.println(e3.toString());
		
		// Comprobacion setters con valores correctos
		e3.setColor("ROJO");
		e3.setConsumoEnergetico('C');
		System.out.println(e3.toString());

	}

}
