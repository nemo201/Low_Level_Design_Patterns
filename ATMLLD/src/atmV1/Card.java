package atmV1;

public class Card {
	private String cardNumber;
	private String pin;
	private String accountNumber;

	public Card(String cardNumber, String pin, String accountNumber) {
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.accountNumber = accountNumber;
	}

	public boolean validatePin(String inputPin) {
		if (this.pin == null || inputPin == null)
			return false;
		String stored = this.pin.trim();
		String provided = inputPin.trim();
		// System.out.println("DEBUG stored='" + stored + "' len=" + stored.length() + "
		// provided='" + provided + "' len=" + provided.length());
		return stored.equals(provided);
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}
}
