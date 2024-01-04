package week4.polymorphism;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.getDetails("AAAA");
		obj.getDetails(34521);
		obj.getDetails(762534189);
		obj.getDetails(5400.12);
	}

	public void getDetails(String employeeName) {
		System.out.println(employeeName);
	}

	public void getDetails(int employeeId) {
		System.out.println(employeeId);
	}

	public void getDetails(long contactNum) {
		System.out.println(contactNum);
	}

	public void getDetails(double employeeSalary) {
		System.out.println(employeeSalary);
	}

}
