package Ejercicio_6;

public class Ejercicio6_App {
	
	//Prueba T2- subiendo a rama

	public static void main(String[] args) {
		// Vamo a esplotar eso

		// Creo una pelicula de prueba
		Pelicula p1 = new Pelicula("Lo que el viento se llevo", 90, 18, "Yo mismo!");
		System.out.println(p1.toString());

		// Espectadores
		Espectador[] espectadores = new Espectador[5];
		espectadores[0] = new Espectador();
		espectadores[1] = new Espectador();
		espectadores[2] = new Espectador();
		espectadores[3] = new Espectador();
		espectadores[4] = new Espectador();

		Cine c1 = new Cine("Cine 1", p1, espectadores, 5.99);
		System.out.println(c1.toString());

	}

}
