package Ejercicio_3;

class Libro {

	// Atributos
	long ISBN; // Utilizo long ya que el ISBN tiene mas digitos que los int soportan
	String titulo;
	String autor;
	int paginas;

	// Constructores
	// Default
	Libro() {
		ISBN = 9780316497541L; // L al final para especificar Long
		this.titulo = "El Ultimo Deseo";
		this.autor = "Andrzej Sapkowski";
		this.paginas = 288;
	}

	Libro(long iSBN, String titulo, String autor, int paginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	// Getters
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por " + autor + " tiene " + paginas + " paginas.";
	}

	public long getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}

	// Setters
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	// Metodos
	// Funcion que compara las paginas de los libros
	void compareTo(Libro otroLibro) {
		if (this.getPaginas() > otroLibro.getPaginas()) {
			int diferencia = this.getPaginas() - otroLibro.getPaginas();
			System.out.println("El libro " + this.getTitulo() + " tiene " + diferencia + " paginas mas que "
					+ otroLibro.getTitulo() + ".");
			return;
		}
		if (otroLibro.getPaginas() > this.getPaginas()) {
			int diferencia = otroLibro.getPaginas() - this.getPaginas();
			System.out.println("El libro " + otroLibro.getTitulo() + " tiene " + diferencia + " paginas mas que "
					+ this.getTitulo() + ".");
			return;
		} else {
			System.out.println("Los dos libros tienen el mismo numero de paginas.");
			return;
		}
	}

}
