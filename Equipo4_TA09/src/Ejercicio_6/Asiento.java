package Ejercicio_6;

public class Asiento extends Cine {
	
	//Attributes	
	private int fila;
	private char columna;
	boolean ocupado;

	//Constructor	
	public Asiento(Pelicula pelicula, double precio, int fila, char columna, boolean ocupado) {
		super(pelicula, precio);
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + "]";
	}	
}
