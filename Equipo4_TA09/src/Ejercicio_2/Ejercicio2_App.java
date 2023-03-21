package Ejercicio_2;

public class Ejercicio2_App {

	public static void main(String[] args) {
		
		//Create and load an array of Serie objects
		Serie[] s = new Serie[5];
		s[0] = new Serie("Game of Thrones", 8, "Action", "HBO");
		s[1] = new Serie("House of the dragon", 1, "Action", "HBO");
		s[2] = new Serie("The last of us", 1, "Drama", "HBO");
		s[3] = new Serie("The mandalorian", 3, "Adventure", "Disney+");
		s[4] = new Serie("Daredevil", 3, "Action", "Netflix");
		
		//Create and load an array of Videojuego objects
		Videojuego[] v = new Videojuego[5];
		v[0] = new Videojuego("League of Legends", 2000, "MOBA", "Riot Games");
		v[1] = new Videojuego("Valorant", 10, "Shooter", "Riot Games");
		v[2] = new Videojuego("The elder scrolls V: Skyrim", 30, "ARPG", "Bethesda");
		v[3] = new Videojuego("Star wars: Jedi survivor", 0, "ARPG", "EA");
		v[4] = new Videojuego("Minecraft", 8, "Sandbox", "Mojang");
		
		//Delivery of some series and videogames
		s[1].deliver();
		s[3].deliver();
		v[0].deliver();
		v[2].deliver();
		v[4].deliver();
		
		//Filter delivered and count them
		System.out.println("Total: " + filterDelivered(s, v));
	}
	
	public static int filterDelivered(Serie[] s, Videojuego[] v) {		
		int c = 0;
		System.out.println("Series y videojuegos entregados:");
		for(Serie serie : s) {
			if(serie.isDelivered() == true) {
				c++;
				System.out.println(serie.toString());
			}
		}
		for(Videojuego videojuego : v) {
			if(videojuego.isDelivered() == true) {
				c++;
				System.out.println(videojuego.toString());
			}
		}		
		return c;
	}

}
