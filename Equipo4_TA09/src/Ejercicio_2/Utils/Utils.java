package Ejercicio_2.Utils;

import Ejercicio_2.Clases.*;

public class Utils {
	
	//Fills array with series and videogames
	public static void loadArray(Serie[] s, Videojuego[] v) {
		
		s[0] = new Serie("Game of Thrones", 8, "Action", "HBO");
		s[1] = new Serie("House of the dragon", 1, "Action", "HBO");
		s[2] = new Serie("The last of us", 1, "Drama", "HBO");
		s[3] = new Serie("The mandalorian", 3, "Adventure", "Disney+");
		s[4] = new Serie("Daredevil", 3, "Action", "Netflix");
		
		v[0] = new Videojuego("League of Legends", 2000, "MOBA", "Riot Games");
		v[1] = new Videojuego("Valorant", 10, "Shooter", "Riot Games");
		v[2] = new Videojuego("The elder scrolls V: Skyrim", 30, "ARPG", "Bethesda");
		v[3] = new Videojuego("Star wars: Jedi survivor", 0, "ARPG", "EA");
		v[4] = new Videojuego("Minecraft", 8, "Sandbox", "Mojang");
	}
	
	//Counts and shows delivered series and videogames
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
	
	// Compares shows and videogames and shows which one has the highest
	// ammount of seasons/hours of gameplay
	public static void showMost(Serie[] s, Videojuego[] v) {
		
		Serie ms = new Serie("" , "", null);
		
		for(Serie serie : s) {
			if(serie.getSeasons() > ms.getSeasons()) {
				ms = serie;
			}
		}
		System.out.println("Serie con más temporadas: " + ms.toString());
		
		Videojuego mv = new Videojuego();
		
		for(Videojuego videojuego : v) {
			if(videojuego.getEstimated_hours() > mv.getEstimated_hours()) {
				mv = videojuego;
			}
		}	
		System.out.println("Videojuego con más horas: " + mv.toString());
	}
}
