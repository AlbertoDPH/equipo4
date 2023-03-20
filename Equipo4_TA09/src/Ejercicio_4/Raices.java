package Ejercicio_4;

/**
 * App que calcula la raiz cuadrada los cuales son introducidos por el usario.
 * La app le pide los tres coeficientes por consola
 * 
 * @author Alberto, Josep, Javier
 * 
 */
public class Raices {

	// Atributos
	private double a;
	private double b;
	private double c;

	// Constructor de la clase el cual recibe por parámetro los tres coeficientes
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Calcula el discriminante de la raiz cuadrada
	 * 
	 * @param a recibe el coeficiente a
	 * @param b recibe el coeficiente a
	 * @param c recibe el coeficiente a
	 * @return devuelve el calculo del determinante
	 */
	public double getDiscriminante(double a, double b, double c) {
		double discriminante = (Math.pow(b, 2)) - (4 * a * c);
		return discriminante;
	}

	/**
	 * Controla si la raiz cuadrada tiene más de un resultado Para ello se basa en
	 * si el discriminante es mayor que 0
	 * 
	 * @param discriminante recibe el discriminante
	 * @return devuelve true si tiene más de un resultado o false si no tiene más de
	 *         un resultado
	 */
	public boolean tieneRaices(double discriminante) {
		if (discriminante > 0)
			return true;
		else
			return false;
	}

	/**
	 * Controla si tiene un único resultado
	 * 
	 * @param discriminante
	 * @return devuelve true si solo tien un resultado o fasle si no tiene
	 */
	public boolean tieneRaiz(double discriminante) {
		if (discriminante == 0)
			return true;
		else
			return false;
	}

	/**
	 * Regoge los resultados los resultados en un Array, tanto si hay uno como dos
	 * resultado
	 * 
	 * @return devuelve un array con los resultados de la raiz
	 */
	public double[] getResultados() {
		double[] resultado = new double[2];
		
		double discriminante = getDiscriminante(a, b, c);

		resultado[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
		resultado[1] = (-b - Math.sqrt(discriminante)) / (2 * a);

		return resultado;

	}

	/**
	 * Nos muestra la posible opciones que son las dos soluciones, una solucion y no
	 * tiene solución. Muestra el resultado por consola.
	 */
	public void calcular() {
		double[] resultado = getResultados();
		
		double discriminante = getDiscriminante(a, b, c);

		if (discriminante > 0) {
			System.out.println("La ecuacion tiene dos soluciones" + "\nPrimer resultado: " + resultado[0] + "\n"
					+ "Seguno resultado: " + resultado[1]);
		} else if (discriminante == 0) {
			System.out.println("Tiene una solucion\n" + "Solución: " + resultado[0]);

		} else {
			System.out.println("No tiene solucion en el conjunto de los reales");
		}

	}

}
