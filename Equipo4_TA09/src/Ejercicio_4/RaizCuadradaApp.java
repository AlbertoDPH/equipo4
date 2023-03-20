package Ejercicio_4;

import javax.swing.JOptionPane;

public class RaizCuadradaApp {

	public static void main(String[] args) {

		// Ejemplos de Ecuaciones de 2º grado
		// No tiene solucion en el conjunto de los reales (2,4,6);
		// La ecuacion tiene dos soluciones (1,8,3);
		// Tiene una solucion(1,-2,1);

		double a = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Introduce constante A", "Ecuación 2º grado", 3));

		double b = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Introduce constante B", "Ecuación 2º grado", 3));

		double c = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Introduce constante C", "Ecuación 2º grado", 3));

		Raices raiz = new Raices(a, b, c);

		raiz.calcular();

	}

}
