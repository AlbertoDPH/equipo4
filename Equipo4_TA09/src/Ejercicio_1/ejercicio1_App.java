package Ejercicio_1;

import java.util.ArrayList;

class ejercicio1_App {

	public static void main(String[] args) {

		// Array de Electrodomestico con 10 posiciones
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		// Rellenamos las posciones del array
		electrodomesticos[0] = new Lavadora();
		electrodomesticos[1] = new Television();
		electrodomesticos[2] = new Lavadora();
		electrodomesticos[3] = new Television();
		electrodomesticos[4] = new Lavadora();
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Lavadora();
		electrodomesticos[7] = new Television();
		electrodomesticos[8] = new Lavadora();
		electrodomesticos[9] = new Television();

		// Variable para calcular el precio total de lavadoras y televisores
		double precioFinalLavadora = 0;
		double precioFinalTV = 0;

		// Recorremos el arrary electrodomesticos y comprobamos si encuentra objetos
		// lavadoras y televisores
		for (Electrodomestico elec : electrodomesticos) {

			// Con instanceof podemos controlar, si es un objeto lavadora o televisor
			if (elec instanceof Lavadora) {
				precioFinalLavadora += elec.getPrecioBase();
			} else
				precioFinalTV += elec.getPrecioBase();

		}
		// Precio total de lavadoras y televisores
		double precioTotal = precioFinalLavadora + precioFinalTV;

		System.out.println("Precio total Lavadoras: " + precioFinalLavadora);
		System.out.println("Precio total Televisores: " + precioFinalTV);
		System.out.println("Precio total: " + precioTotal);

		// Comprobaciones Electrodomestico
		// Constructor por defecto
//		Electrodomestico e1 = new Electrodomestico();
//		System.out.println(e1.toString());
//
//		// Constructor precio y peso
//		Electrodomestico e2 = new Electrodomestico(99.99, 10);
//		System.out.println(e2.toString());
//
//		// Constructor atributos correctos
//		Electrodomestico e3 = new Electrodomestico(80, "negro", 'B', 15);
//		System.out.println(e3.toString());
//
//		// Constructor color erroneo
//		Electrodomestico e4 = new Electrodomestico(25, "purpura", 'A', 5);
//		System.out.println(e4.toString());
//
//		// Constructor eficiencia erronea
//		Electrodomestico e5 = new Electrodomestico(50, "gris", 'Z', 7);
//		System.out.println(e5.toString());
//
//		// Comprobacion setters con valores erroneos
//		e3.setConsumoEnergetico('Z');
//		e3.setColor("magenta");
//		System.out.println(e3.toString());
//
//		// Comprobacion setters con valores correctos
//		e3.setColor("ROJO");
//		e3.setConsumoEnergetico('C');
//		System.out.println(e3.toString());
//
//		// Comprobacion lavadora contruct
//		Lavadora l1 = new Lavadora();
//		System.out.println(l1.toString());
//
//		// Constructor precio y peso
//		Lavadora l2 = new Lavadora(40, 18);
//		System.out.println(l2.toString());
//
//		// Constructor con todos los datos
//		Lavadora l3 = new Lavadora(50, "azul", 'A', 20, 8);
//		System.out.println(l3.toString());
//
//		// Constructor con todos los datos con carga de + de 30
//		Lavadora l4 = new Lavadora(50, "azul", 'A', 20, 35);
//		System.out.println(l4.toString());
	}

}
