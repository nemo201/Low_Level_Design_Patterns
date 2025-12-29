package atmV1;

public class CashDispenser {
	private double availabeCash;
	
	public CashDispenser(double initialCash) {
		this.availabeCash = initialCash;
	}
	
	public boolean hasSufficientCash(double amount) {
		return this.availabeCash >= amount;
	}
	
	public void dispense(double amount) {
		if (!hasSufficientCash(amount)) {
			throw new RuntimeException("Insufficient cash in dispenser");
		}
		availabeCash -= amount;
		System.out.println("Please collect your cash: " + amount);
	}
}
