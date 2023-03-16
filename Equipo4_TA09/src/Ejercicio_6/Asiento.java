package Ejercicio_6;

public class Asiento extends Cine {
	
	//Attributes
	private static int f_count = 1;
	private static int c_count = 65;
	
	private int fila;
	private char columna;
	boolean ocupado;

	//Constructor	
	public Asiento(Pelicula pelicula, int fila, char columna, boolean ocupado) {
		super(pelicula);
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}
	
	public Asiento() {
		super();
		this.fila = genradorAsientos()[0];
		this.columna = (char)genradorAsientos()[1];
		this.ocupado = false;
	}
	
	//Methods
	public int[] genradorAsientos() {
		
		int f, c;
		
		if(f_count < 9) {
			f = f_count++;
			c = c_count;
		} else {
			f_count = 1;
			c_count++;
			f = f_count++;
			c = (char)c_count;
		}
		
		int[] t = {f, c};
		
		return t;
	}
	
	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + "]";
	}	
}
