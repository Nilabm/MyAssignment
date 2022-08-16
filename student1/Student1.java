package org.student1;

import org.department1.Department1;


public class Student1 extends Department1 {
public void studentName() {
	System.out.println("Student Name");
}
public void studentDepartment() {
	System.out.println("Student Department");
}
public void studentId() {
	System.out.println("Student Id");
}
public static void main(String[] args) {
	Student1 std=new Student1();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
	std.studentName();
	std.studentDepartment();
	std.studentId();
	std.deptName();
}
}