package Ejercicio_2;

public class Ejercicio2_App {

	public static void main(String[] args) {
		
		//Create an array of Serie objects and Videojuego objects and load with examples
		Serie[] s = new Serie[5];		
		Videojuego[] v = new Videojuego[5];
		
		Utils.loadArray(s, v);
	
		//Delivery of some series and videogames
		s[1].deliver();
		s[3].deliver();
		v[0].deliver();
		v[2].deliver();
		v[4].deliver();
		
		//Filter delivered and count them
		System.out.println("Total: " + Utils.filterDelivered(s, v));
	}
}
