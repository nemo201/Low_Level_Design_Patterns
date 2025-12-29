package atmV1;

public class CardInsertedState implements ATMState {
	private ATM atm;

	public CardInsertedState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public void insertCard(Card card) {
		throw new RuntimeException("Card already inserted");
	}

	@Override
	public void enterPin(String pin) {
		// TODO Auto-generated method stub
		if (!atm.getCurrentCard().validatePin(pin)) {
			System.out.println("Invalid PIN!");
			return;
		}

		Account account = atm.getBankService().getAccount(atm.getCurrentCard().getAccountNumber());
		atm.setCurrentAccount(account);
		System.out.println("PIN accepted");
		atm.setState(atm.getAuthenticatedState());

	}

	@Override
	public void checkBalance() {
		throw new RuntimeException("Authenticate first");
	}

	@Override
	public void withdraw(double amount) {
		throw new RuntimeException("Authenticate first");
	}

	@Override
	public void ejectCard() {
		throw new RuntimeException("Authenticate first");
	}

}
