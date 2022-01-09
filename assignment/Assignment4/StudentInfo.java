package week3.day1.assignment.Assignment4;

import week3.day1.assignment.Students;

public class StudentInfo {

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is: "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID is: "+id);
		System.out.println("Student name is: "+name);
	}
	public void getStudentInfo(String email, long phone)
	{
		System.out.println("Student email is: "+email);
		System.out.println("Student Phone Number is: "+phone);
	}
	
	public static void main(String[] args) 
	{
		StudentInfo stu = new StudentInfo();
		stu.getStudentInfo(101);
		stu.getStudentInfo(101, "Shiva");
		stu.getStudentInfo("work2anjani@gmail.com", 8807377392L);
	}

}
