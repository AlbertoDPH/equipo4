package Ejercicio_2;

public class Entregable {
	
	//Attributes
	private String title;
	private boolean delivered;
	private String gender;
	
	//Contrsuctors
	public Entregable() {
		this.title = "Default title";
		this.delivered = false;
		this.gender = "Default gender";
	}
	
	public Entregable(String title) {
		this.title = title;
		this.delivered = false;
		this.gender = "Default gender";
	}
	
	public Entregable(String title, String gender) {
		this.title = title;
		this.delivered = false;
		this.gender = gender;
	}

	//Setters & getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Entregable [title=" + title + ", delivered=" + delivered + ", gender=" + gender + "]";
	}
}
