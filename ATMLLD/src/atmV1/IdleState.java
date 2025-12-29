package atmV1;

public class IdleState implements ATMState {
	private ATM atm;
	
	public IdleState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public void insertCard(Card card) {
		atm.setCurrentCard(card);
		System.out.println("Card inserted");
		atm.setState(atm.getCardInsertedState());
	}

	@Override
	public void enterPin(String pin) {
		throw new RuntimeException("No card inserted");
	}

	@Override
	public void checkBalance() {
		throw new RuntimeException("No card inserted");
		
	}

	@Override
	public void withdraw(double amount) {
		throw new RuntimeException("No card inserted");
		
	}

	@Override
	public void ejectCard() {
		throw new RuntimeException("No card inserted");
		
	}
	

}
