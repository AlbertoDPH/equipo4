package Ejercicio_2.Clases;

public class Videojuego extends Entregable {

	//Attributes
	private double estimated_hours;
	private String company;
	
	//Contructors
	public Videojuego() {
		super();
		this.estimated_hours = 0;
		this.company = "Default company";
	}

	public Videojuego(String title, double estimated_hours) {
		super(title);
		this.estimated_hours = estimated_hours;
		this.company = "Default company";
	}
	
	public Videojuego(String title, double estimated_hours, String gender, String company) {
		super(title, gender);
		this.estimated_hours = estimated_hours;
		this.company = company;
	}

	//Setters & getters
	public double getEstimated_hours() {
		return estimated_hours;
	}

	public void setEstimated_hours(double estimated_hours) {
		this.estimated_hours = estimated_hours;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	//ToString
	public String toString() {
		return "Videojuego [title=" + getTitle() + ", estimated hours=" + estimated_hours + ", gender=" + getGender() + ", company=" + company + "]";
	}
}
