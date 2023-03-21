package Ejercicio_2;

public class Serie extends Entregable{

	//Attributes
	private int seasons;
	private String creator;
	
	//Constructors
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

	//Setters & getters
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

	//ToString
	public String toString() {
		return "Serie [Title=" + getTitle() + ", seasons=" + seasons + ", gender=" + getGender() + ", creator="
				+ creator + "]";
	}

	
}
