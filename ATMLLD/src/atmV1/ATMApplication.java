package atmV1;

public class ATMApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bankService = new BankService();
		Account account = new Account("ACC123", 5000.0);
		bankService.addAccount(account);
		
		CashDispenser cashDispenser = new CashDispenser(10000.0);
		ATM atm = new ATM(bankService, cashDispenser);
		
		Card card = new Card("CARD123", "1234", "ACC123");
		
		try {
			atm.insertCard(card);
			atm.enterPin("1234");
			atm.checkBalance();
			atm.withdraw(1000.0);
			atm.checkBalance();
			atm.ejectCard();
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
