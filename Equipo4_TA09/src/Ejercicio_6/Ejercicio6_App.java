package Ejercicio_6;

public class Ejercicio6_App {
	
	public static void main(String args[]) {
		
		//Film example
		Pelicula p1 = new Pelicula("Avatar", 161, 7, "James Cameron");
		Pelicula p2 = new Pelicula("Avatar 2", 190, 7, "James Cameron");
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Spectator example
		Espectador e1 = new Espectador("Juan", 18, 100);
		Espectador e2 = new Espectador("Jose", 20, 50);
		
		System.out.println(e1);
		System.out.println(e2);
		
		//Cinema example		
		Asiento[][] c = new Asiento[9][8];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 8; j++) {
				Asiento a = new Asiento();
				c[i][j] = a;
			}
		}
		
		System.out.println(c[0][2]);

	}
}
