package week4.polymorphism;

public class StudentsDetails {

	public static void main(String[] args) {
		StudentsDetails obj = new StudentsDetails();
		obj.getStudentInfo(34521);
		obj.getStudentInfo("AAA", 34521);
		obj.getStudentInfo(1234567890, "ZZZ123@gmail.com");

	}

	public void getStudentInfo(int employeeId) {
		System.out.println(employeeId);
	}

	public void getStudentInfo(String employeeName, int employeeId) {
		System.out.println(employeeName + " " + employeeId);
	}

	public void getStudentInfo(long contactNum, String email) {
		System.out.printf(contactNum + " " + email);
	}

}
