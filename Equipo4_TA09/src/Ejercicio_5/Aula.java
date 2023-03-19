package Ejercicio_5;

class Aula {

	// Atributos
	private int identificador;
	private Estudiante[] estudiantes;
	private Profesor profesor;

	Aula() {
		this.identificador = identificador++;
	}

	Aula(Estudiante[] estudiantes, Profesor profesor) {
		this.identificador = identificador++;
	}

	@Override
	public String toString() {
		return "Aula [identificador=" + identificador + "]";
	}

}
