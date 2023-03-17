package Ejercicio_6;

import java.util.ArrayList;

public class Ejercicio6_App {

	public static void main(String[] args) {
		// Vamo a esplotar eso

		// Creo una pelicula de prueba
				Pelicula p1 = new Pelicula("Lo que el viento se llevo", 90, 18, "Yo mismo!");
				// System.out.println(p1.toString());

				// Espectadores
				ArrayList<Espectador> espectadores = Espectador.generadorEspectadores(72);
				Espectador e1 = new Espectador("Yusep", 69, 15);
				espectadores.add(e1);
				Espectador e2 = new Espectador("Martin", 18, 10);
				espectadores.add(e2);

				// Se crea el cine con los espectadores creados
				Cine c1 = new Cine(p1, espectadores, 5.99);
				// System.out.println(c1.toString());

				// Muestra los asientos asignados
				c1.verAsientosAsignados();

				// Muestra la pelicula actual
				c1.peliculaActual();

				// Muestra espectador 1
				System.out.println(e2.toString());

				ArrayList<Espectador> espectadores2 = Espectador.generadorEspectadores(5);
				Pelicula p2 = new Pelicula("Kill Bill", 90, 1, "Otra persona que no recuerdo su nombre");
				c1.setPrecio(1);
				c1.setPelicula(p2);
				c1.setEspectadores(espectadores2);
				c1.verAsientosAsignados();
				c1.peliculaActual();

	}

}
