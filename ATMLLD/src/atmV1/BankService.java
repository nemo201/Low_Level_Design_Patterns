package atmV1;

import java.util.HashMap;
import java.util.Map;

public class BankService {
	private Map<String, Account> accounts = new HashMap<>();
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	public Account getAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
}
