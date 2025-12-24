package VendingMachineV2;

public enum Coin {
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25),
	HALF_DOLLAR(50),
	DOLLAR(100);

	private final int value;

	Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
