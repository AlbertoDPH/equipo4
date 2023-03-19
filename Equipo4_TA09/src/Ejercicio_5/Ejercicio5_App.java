package Ejercicio_5;

class Ejercicio5_App {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		Estudiante e3 = new Estudiante();

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

		Profesor p1 = new Profesor();
		Profesor p2 = new Profesor();
		Profesor p3 = new Profesor();
		Profesor p4 = new Profesor();
		Profesor p5 = new Profesor();

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());

		Aula a1 = new Aula();
		Aula a2 = new Aula();
		System.out.println(a1.toString());
		System.out.println(a2.toString());

		Estudiante e4 = new Estudiante("Gumersindo", 23, 'M', 69);
		System.out.println(e4.toString());

	}

}
