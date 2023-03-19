package Ejercicio_5;

class Aula {

	private final int MAX_ESTUDIANTES = 25;

	// Atributos
	private int identificador;
	private static int siguienteIdentificador = 1;
	private Estudiante[] estudiantes = new Estudiante[MAX_ESTUDIANTES];
	private Profesor profesor;

	Aula(Profesor profesor, Estudiante[] estudiantes) {
		this.identificador = siguienteIdentificador;
		siguienteIdentificador++;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Aula numero " + identificador + "";
	}

}
