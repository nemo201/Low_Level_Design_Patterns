package atmV1;

public class ATM {
	private ATMState idleState;
	private ATMState cardInsertedState;
	private ATMState authenticatedState;
	private ATMState currentState;
	
	private Card currentCard;
	private Account currentAccount;
	
	private BankService bankService;
	private CashDispenser cashDispenser;
	
	ATM (BankService bankService, CashDispenser cashDispenser) {
		this.bankService = bankService;
		this.cashDispenser = cashDispenser;
		
		this.idleState = new IdleState(this);
		this.cardInsertedState = new CardInsertedState(this);
		this.authenticatedState = new AuthenticatedState(this);
		this.currentState = idleState;
	}
	
	public void insertCard(Card card) {
		currentState.insertCard(card);
	}
	
	public void enterPin(String pin) {
		currentState.enterPin(pin);
	}
	
	public void checkBalance() {
		currentState.checkBalance();
	}
	
	public void withdraw(double amount) {
		currentState.withdraw(amount);
	}
	
	public void ejectCard() {
		currentState.ejectCard();
	}
	
	void setState(ATMState state) {
		this.currentState = state;
	}
	
	void setCurrentCard(Card card) {
		this.currentCard = card;
	}
	
	void setCurrentAccount(Account account) {
		this.currentAccount = account;
	}
	
	void reset() {
		this.currentCard = null;
		this.currentAccount = null;
	}
	
	ATMState getIdleState() {
		return idleState;
	}
	
	ATMState getCardInsertedState() {
		return cardInsertedState;
	}
	
	ATMState getAuthenticatedState() {
		return authenticatedState;
	}
	
	Card getCurrentCard() {
		return currentCard;
	}
	
	Account getCurrentAccount() {
		return currentAccount;
	}
	
	BankService getBankService() {
		return bankService;
	}
	
	CashDispenser getCashDispenser() {
		return cashDispenser;
	}
}
