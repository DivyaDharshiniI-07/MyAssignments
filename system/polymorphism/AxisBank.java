package week4.polymorphism;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
		System.out.println("Deposit of savings");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();

	}
}
