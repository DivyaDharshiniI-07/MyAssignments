package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Break applied");
	}
public void applyGear() {
	System.out.println("Apply the 4th Gear");
		
	}
public void switchOnAc() {
	System.out.println("Turn on the AC");
	
}
public void applyaccleration() {
	System.out.println("Acclerate faster");
	
}
	public static void main(String[] args) {
		System.out.println("Car Actions:");
		Car action = new Car();
		//System.out.println("Car Actions:");
		action.applyBreak();
		action.applyGear();
		action.switchOnAc();
		action.applyaccleration();
	}

}
