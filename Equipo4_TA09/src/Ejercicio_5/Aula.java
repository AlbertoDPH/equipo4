package Ejercicio_5;

import java.util.ArrayList;

class Aula {

	private final int MAX_ESTUDIANTES = 25;

	// Atributos
	private int identificador; // Identificador de aula
	private static int siguienteIdentificador = 1; // Incrementador por cada aula
	private ArrayList<Estudiante> estudiantes; // listado de estudiantes
	private Profesor profesor; // Profesor
	private String materiaImpartida; // Materia impartida en el aula
	private boolean hayClase; // Booleano para comprobar si hay clase y cumple los requisitos

	// Constructor
	Aula(Profesor profesor, ArrayList<Estudiante> estudiantes, String materiaImpartida) {
		this.identificador = siguienteIdentificador;
		siguienteIdentificador++;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
		this.materiaImpartida = aulaUtils.validadorDeMateria(materiaImpartida);
		this.hayClase = checkRequisitos(estudiantes, profesor, aulaUtils.validadorDeMateria(materiaImpartida));
	}

	@Override
	public String toString() {
		return "En el Aula numero " + identificador + " se imparte " + materiaImpartida;
	}

	// Getters
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public String getMateriaImpartida() {
		return materiaImpartida;
	}

	public boolean isHayClase() {
		return hayClase;
	}

	public int getIdentificador() {
		return identificador;
	}

	// Setters
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setMateriaImpartida(String materiaImpartida) {
		this.materiaImpartida = materiaImpartida;
	}

	public void setHayClase(boolean hayClase) {
		this.hayClase = hayClase;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	// Comprobar si el profesor esta disponible, si la materia impartida es la
	// correspondiente, y si hay mas del 50% de alumnos
	private boolean checkRequisitos(ArrayList<Estudiante> estudiantes, Profesor profesor, String materiaImpartida) {
		// Comprueba si los estudiantes caben en el aula
		if (estudiantes.size() > MAX_ESTUDIANTES) {
			System.out.println("Demasiados estudiantes.");
			return false;
		}

		// Comprobar que el profesor esta ausente
		if (profesor.isAusente() == true) {
			System.out.println("El profesor " + profesor.getNombre() + " se encuentra hoy ausente.");
			return false;
		}

		// Comprueba que el profesor de la asignatura del aula
		if (!profesor.getMateriaImpartida().equals(materiaImpartida)) {
			System.out.println("El profesor " + profesor.getNombre() + " no imparte la materia correcta. Ella imparte "
					+ profesor.getMateriaImpartida() + ".");
			return false;
		}

		int contadorAusentes = 0; // Inicializa contador de ausentes

		// Cuenta ausentes
		for (int i = 0; i < estudiantes.size(); i++) {
			if (estudiantes.get(i).isAusente() == true) {
				contadorAusentes++;
			}
		}

		// Comprueba si hay mas de la mitad de alumnos ausentes
		if (contadorAusentes > (estudiantes.size() / 2)) {
			System.out.println("Mas de la mitad de estudiantes no estan asistiendo.");
			return false;
		}

		// Si todo es correcto, hay clase
		System.out.println("La clase empezará en breve.");
		return true;
	}

	// Si se cumplen todos los requisitos, mostrar alumnos aprobados separados por
	// genero.
	public void mostrarAprobados(Aula aula) {
		if (aula.isHayClase() == true) {
			int alumnosAprobados = 0;
			int alumnasAprobadas = 0;

			// Cuenta los alumnos aprobados por genero
			for (int i = 0; i < aula.getEstudiantes().size(); i++) {
				if (aula.estudiantes.get(i).genero == 'M' && aula.estudiantes.get(i).getCalificacion() >= 50) {
					alumnosAprobados++;
				}
				if (aula.estudiantes.get(i).genero == 'F' && aula.estudiantes.get(i).getCalificacion() >= 50) {
					alumnasAprobadas++;
				}
			}
			// Calcula el total y lo muestra
			int totalAprobados = alumnosAprobados + alumnasAprobadas;
			System.out.println(
					"En el aula " + aula.getIdentificador() + " hay " + totalAprobados + " alumnos aprobados.");
			System.out.println(+alumnosAprobados + " de los alumnos aprobados son varones, mientras que "
					+ alumnasAprobadas + " son mujeres.");
			return;
		} else {
			System.out.println("No hay clase, no se pueden dar las notas.");
			return;
		}
	}

}
