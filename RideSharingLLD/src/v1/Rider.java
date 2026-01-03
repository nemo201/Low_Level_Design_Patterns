package v1;

public class Rider extends User {
	public Rider(String userId, String name) {
		super(userId, name);
	}

	public String getName() {
		return this.name;
	}

}
