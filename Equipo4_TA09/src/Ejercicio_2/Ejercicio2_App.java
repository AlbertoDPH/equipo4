package Ejercicio_2;

public class Ejercicio2_App {

	public static void main(String[] args) {
		
		//Crate serie
		Serie s = new Serie("Game of Thones", 8, false, "Action", "HBO");
		System.out.println(s.toString());
		
		//See if it is delivered
		System.out.println("Is delivered? " + s.isDelivered());
		
		//Change delivered to true and print result
		s.deliver();
		System.out.println("Changed to true: " + s.isDelivered());
		
		//Change delivered to false and print result
		s.returner();
		System.out.println("Returned to false: " + s.isDelivered());
	}

}
