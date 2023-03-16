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
		espectadores[0] = new Espectador("Pepe",20,10);
		espectadores[1] = new Espectador("Pepe",18,20);
		espectadores[2] = new Espectador("Pepe",15,30);
		espectadores[3] = new Espectador("Pepe",12,40);
		espectadores[4] = new Espectador("Pepe",30,4);

		Cine c1 = new Cine("Cine 1", p1, espectadores, 5.99);
		System.out.println(c1.toString());
		
	
		
		c1.sentarEspectadores(espectadores, p1);

	}

}
