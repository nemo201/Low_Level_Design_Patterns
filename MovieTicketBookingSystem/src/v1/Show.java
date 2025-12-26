package v1;

public class Show {
	private String showid;
	private Movie movie;
	private Screen screen;
	private String showTime;
	
	public Show(String showid, Movie movie, Screen screen, String showTime) {
		this.showid = showid;
		this.movie = movie;
		this.screen = screen;
		this.showTime = showTime;
	}
	
	public Screen getScreen() {
		return screen;
	}
	
	public Movie getMovie() {
		return movie;
	}
}
