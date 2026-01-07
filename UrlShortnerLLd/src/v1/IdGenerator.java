package v1;

public class IdGenerator {
	private static final String BASE62 = "0123456789abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRST";
	
	public String encode(long id) {
		StringBuilder sb = new StringBuilder();
		while (id > 0) {
			sb.append(BASE62.charAt((int)(id % 62)));
			id /= 62;
		}
		return sb.reverse().toString();
	}
}
