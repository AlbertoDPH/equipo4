package Ejercicio_5;

import java.util.ArrayList;

class Ejercicio5_App {

	public static void main(String[] args) {

		// Genero estudiantes aleatorios
		ArrayList<Estudiante> estudiantes = Estudiante.generadorEstudiantes(24);

		// Genero 3 profesores aleatorios
		Profesor p1 = new Profesor();
		Profesor p2 = new Profesor();
		Profesor p3 = new Profesor();

		// Compruebo profesores
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		// Creo aula 1 con profesor 1, estudiantes y asignatura matematicas
		Aula a1 = new Aula(p1, estudiantes, "matematicas");

		// Muestro informacion del aula
		System.out.println(a1.toString());

		// Muestro aprobados
		a1.mostrarAprobados(a1);

	}

}
