package Ejercicio_4;

public class Raices {

	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante(double a, double b, double c) {
		double discriminante = (Math.pow(b, 2)) - (4 * a * c);
		return discriminante;
	}

	public boolean tieneRaices(double discriminante) {
		if (discriminante > 0)
			return true;
		else
			return false;
	}

	public boolean tieneRaiz(double discriminante) {
		if (discriminante == 0)
			return true;
		else
			return false;
	}

	public double[] getResultados() {
		double[] resultado = new double[2];
		double discriminante = getDiscriminante(a, b, c);

		resultado[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
		resultado[1] = (-b - Math.sqrt(discriminante)) / (2 * a);

		return resultado;

	}

	public void calcular() {
		double[] resultado = getResultados();
		double discriminante = getDiscriminante(a, b, c);

		if (discriminante > 0) {
			System.out.println("La ecuación tiene dos soluciones" + "\nPrimer resultado: " + resultado[0] + "\n"
					+ "Seguno resultado: " + resultado[1]);
		} else if (discriminante == 0) {
			System.out.println("Tiene una solución\n" + "Solución: " + resultado[0]);

		} else {
			System.out.println("No tiene solución en el conjunto de los reales");
		}

	}

	@Override
	public String toString() {
		return "Raices [coeA=" + a + ", coeB=" + b + ", coeC=" + c + "]";
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getCoeB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
