package week4.polymorphism;

public class BankInfo {
	public void saving() {
		System.out.println("Savings of people");
	}

	public void fixed() {
		System.out.println("Fixed interest");
	}

	public void deposit() {
		this.saving();
		System.out.println("Deposit of money");
	}
}
