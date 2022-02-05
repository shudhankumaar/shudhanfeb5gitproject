package org.school;

public class Student {
	public void attendance() {
System.out.println("No.of students present=56");
System.out.println("No.of students absent=4");
	}
	public void totalNoOfStudents() {
		int present = 56;
		int absent = 4;
		System.out.println(present+absent);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.attendance();
		s.totalNoOfStudents();
	}

}
