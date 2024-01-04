package org.system;

public class Desktop extends Computer {
	public void desptopSize() {
		System.out.println("1440x900");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.storage();
		obj.windowsVersion();
		obj.desptopSize();
	}
}
