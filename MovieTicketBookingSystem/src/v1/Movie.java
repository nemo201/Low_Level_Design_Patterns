package v1;

public class Movie {
	private String id;
	private String name;
	private int duration; // duration in minutes
	
	public Movie(String id, String name, int duration) {
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
}
