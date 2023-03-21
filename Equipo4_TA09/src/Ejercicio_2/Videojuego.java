package Ejercicio_2;

public class Videojuego {

	//Attributes
	private String title;
	private double estimated_hours;
	private boolean delivered;
	private String gender;
	private String company;
	
	//Contructors
	public Videojuego() {
		this.title = "Default title";
		this.estimated_hours = 0;
		this.delivered = false;
		this.gender = "Default gender";
		this.company = "Default company";
	}

	public Videojuego(String title, double estimated_hours) {
		this.title = title;
		this.estimated_hours = estimated_hours;
		this.delivered = false;
		this.gender = "Default gender";
		this.company = "Default company";
	}
	
	public Videojuego(String title, double estimated_hours, String gender, String company) {
		this.title = title;
		this.estimated_hours = estimated_hours;
		this.delivered = false;
		this.gender = gender;
		this.company = company;
	}

	//Setters & getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getEstimated_hours() {
		return estimated_hours;
	}

	public void setEstimated_hours(double estimated_hours) {
		this.estimated_hours = estimated_hours;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Videojuego [title=" + title + ", estimated_hours=" + estimated_hours + ", delivered=" + delivered
				+ ", gender=" + gender + ", company=" + company + "]";
	}
	
	
}
