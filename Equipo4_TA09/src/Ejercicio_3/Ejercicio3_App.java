package Ejercicio_3;

class Ejercicio3_App {

	public static void main(String[] args) {

		// Creo libro por defecto
		Libro l1 = new Libro();
		// Creo libro con constructor completo
		Libro l2 = new Libro(9788445000670L, "El señor de los anillos II. Las Dos Torres", "J.R.R. Tolkien", 480);

		// Muestro su informacion
		System.out.println(l1.toString());
		System.out.println(l2.toString());

		// Comparo el uno con el otro
		l1.compareTo(l2);

	}

}
