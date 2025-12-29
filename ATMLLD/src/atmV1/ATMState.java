package atmV1;

public interface ATMState {
	void insertCard(Card card);
	void enterPin(String pin);
	void checkBalance();
	void withdraw(double amount);
	void ejectCard();
}
