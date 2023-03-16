package Ejercicio_6;

public class Ejercicio6_App {

	public static void main(String[] args) {
		// Vamo a esplotar eso

		// Creo una pelicula de prueba
		Pelicula p1 = new Pelicula("Lo que el viento se llevo", 90, 18, "Yo mismo!");
		System.out.println(p1.toString());

		// Espectadores
		Espectador[] espectadores = Espectador.generadorEspectadores(10);

		Cine c1 = new Cine("Cine 1", p1, espectadores, 5.99);
		System.out.println(c1.toString());

	}

}
