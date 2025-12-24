package VendingMachineV2;

public class ItemShelf {
	Item item;
	boolean soldOut;
	int code;
	
	public int getCode() {
		return code;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public boolean isSoldOut() {
		return soldOut;
	}
	
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
}
