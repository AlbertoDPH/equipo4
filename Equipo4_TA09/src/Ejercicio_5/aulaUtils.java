package Ejercicio_5;

// Paquete de utilidades para aula con variables por defecto/reusables

class aulaUtils {

	protected final static String[] MATERIAS = { "MATEMATICAS", "FILOSOFIA", "FISICA" };
	protected final static String MATERIA_DEFAULT = "MATEMATICAS";
	
	// Funcion que comprueba que la materia introducida sea valida
	static String validadorDeMateria(String materia) {
		materia.toUpperCase();
		for (String m : MATERIAS) {
			if (materia.equals(m)) {
				return materia;
			}
		}
		return MATERIA_DEFAULT;
	}

}
