package week4.polymorphism;

public class Car extends Vehicle {
	public void noOfWheel() {
		System.out.println("Four Wheelers");
	}

	public void carPrice() {
		System.out.println("5k-8k");
	}

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.noOfWheel();
		obj1.carPrice();
		obj1.modelNum();
	}
}
