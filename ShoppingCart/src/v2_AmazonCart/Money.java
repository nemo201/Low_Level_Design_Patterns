package v2_AmazonCart;

public class Money {
	private String currency = "INR";
	private double amount;
	
	Money(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
