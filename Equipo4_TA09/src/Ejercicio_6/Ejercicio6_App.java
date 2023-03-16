package Ejercicio_6;

import java.util.ArrayList;

public class Ejercicio6_App {

	public static void main(String[] args) {
		// Vamo a esplotar eso

		// Creo una pelicula de prueba
		Pelicula p1 = new Pelicula("Lo que el viento se llevo", 90, 18, "Yo mismo!");
		System.out.println(p1.toString());

		// Espectadores
		ArrayList<Espectador> espectadores = Espectador.generadorEspectadores(0);
		Espectador e1 = new Espectador("Yusep", 69, 15);
		espectadores.add(e1);
		Espectador e2 = new Espectador("Martin", 18, 5);
		espectadores.add(e2);

		Cine c1 = new Cine("Cine 1", p1, espectadores, 5.99);
		System.out.println(c1.toString());
		
		c1.verAsientosAsignados();

	}

}
