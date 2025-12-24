package VendingMachineV2;

public interface States {
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
	
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
	
	public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
	
	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;
	
	public void dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;
	
	public void refundFullMoney(VendingMachine machine) throws Exception;
	
	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
