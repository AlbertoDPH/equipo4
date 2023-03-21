package Ejercicio_2;

public class Serie {

	//Attributes
	private String title;
	private int seasons;
	private boolean delivered;
	private String gender;
	private String creator;
	
	//Constructors
	public Serie(String title, String gender, String creator) {		
		this.title = title;
		this.seasons = 3;
		this.delivered = false;
		this.gender = gender;
		this.creator = creator;		
	}
	
	public Serie(String title, int seasons, boolean delivered, String gender, String creator) {		
		this.title = title;
		this.seasons = seasons;
		this.delivered = delivered;
		this.gender = gender;
		this.creator = creator;		
	}

	//Setters & getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", seasons=" + seasons + ", delivered=" + delivered + ", gender=" + gender
				+ ", creator=" + creator + "]";
	}
}
