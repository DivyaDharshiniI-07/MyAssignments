package org.system;

public class Student extends Department {
	public void studentName() {
		System.out.println("ZZZ");
	}
	public void studentDept() {
		System.out.println("XXX");
	}
	public void studentId() {
		System.out.println("222");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
	}
	
}
