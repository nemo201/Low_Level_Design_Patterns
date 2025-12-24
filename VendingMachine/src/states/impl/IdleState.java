package states.impl;

import java.util.ArrayList;
import java.util.List;

import states.State;
import vendingMachine.Coin;
import vendingMachine.Item;
import vendingMachine.VendingMachine;

public class IdleState implements State {

	public IdleState() {
		System.out.println("Currently Vending machine is in IdleState");
	}
	
	public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		machine.setVendingMachineState(new HasMoneyState());
	}

	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		 throw new Exception("first you need to click on insert coin button");

	}

	public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("you can not insert Coin in idle state");

	}

	public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
		 throw new Exception("you can not choose Product in idle state");

	}

	public int getChange(int returnChangeMoney) throws Exception {
		throw new Exception("you can not get change in idle state");
	}

	public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
		throw new Exception("you can not get refunded in idle state");
	}

	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("proeduct can not be dispensed idle state");
	}

	public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
		machine.getInventory().addItem(item, codeNumber);
	}

}
