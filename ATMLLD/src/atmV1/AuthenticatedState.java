package atmV1;

public class AuthenticatedState implements ATMState {
	private ATM atm;
	
	AuthenticatedState(ATM atm) {
		this.atm = atm;
	}

	@Override
	public void insertCard(Card card) {
		throw new RuntimeException("Transaction in progress");
	}

	@Override
	public void enterPin(String pin) {
		throw new RuntimeException("Transaction in progress");
	}

	@Override
	public void checkBalance() {
		System.out.println("Your balance is: " + atm.getCurrentAccount().getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		Account account = atm.getCurrentAccount();
		CashDispenser dispenser = atm.getCashDispenser();
		
		if (!account.hasSufficientBalance(amount)) {
			throw new RuntimeException("Insufficient account balance");
		}
		if (!dispenser.hasSufficientCash(amount)) {
			throw new RuntimeException("ATM has insufficient cash");
		}
		account.debit(amount);
		dispenser.dispense(amount);
	}

	@Override
	public void ejectCard() {
		System.out.println("Ejecting card...");
		atm.reset();
		atm.setState(atm.getIdleState());
		
	}
	
	
}
