package v1;

import java.util.List;

public class Theatre {
	private String name;
	private List<Screen> screens;
	
	public Theatre(String name, List<Screen> screens) {
		this.name = name;
		this.screens = screens;
	}
	
	public List<Screen> getScreens() {
		return screens;
	}
}
