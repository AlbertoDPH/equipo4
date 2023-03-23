package Ejercicio_2.Clases;

public class Serie extends Entregable {

	// Attributes
	private int seasons;
	private String creator;

	// Constructors
	public Serie(String title, String gender, String creator) {
		super(title, gender);
		this.seasons = 3;
		this.creator = creator;
	}

	public Serie(String title, int seasons, String gender, String creator) {
		super(title, gender);
		this.seasons = seasons;
		this.creator = creator;
	}

	// Setters & getters
	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	// ToString
	public String toString() {
		return "Serie con titulo: " + getTitle() + ", de " + seasons + " temporadas con genero " + getGender()
				+ " y creado por " + creator + ".";
	}

	// Method
	public int compareTo(Videojuego v) {
		if (this.seasons < v.getEstimated_hours()) {
			return -1;
		} else if (this.seasons == v.getEstimated_hours()) {
			return 0;
		} else {
			return 1;
		}
	}

}
