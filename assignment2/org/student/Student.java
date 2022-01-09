package week3.day1.assignment2.org.student;

import week3.day1.assignment2.org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("This method is student Name");
	}
	public void studentDept()
	{
		System.out.println("This method is Student department");
	}
	public void studentId()
	{
		System.out.println("This method is Student Id");
	}

	public static void main(String[] args) {

			Student stud = new Student();
			stud.collegeName();
			stud.collegeCode();
			stud.collegeRank();
			stud.deptName();
			stud.studentId();
			stud.studentName();
			stud.studentDept();

	}

}
