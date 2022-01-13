package week_1;

import java.util.Scanner;

public class students {
	static int totalStudents;
	int roll;
	String name;
	String course;
	public students(){
		totalStudents = 0;
		roll = 0;
		name = "";
		course = ""; 
	}
	public students(int x, String n, String c){
		roll = x;
		name = n;
		course = c;
	}
	public int getTotalStudents(){
		return totalStudents;
	}
	public void enter(){
		System.out.println("Enter Detail for Student-"+totalStudents+": ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Roll Number: ");
			roll = s.nextInt();
			s.nextLine();
		System.out.println("Enter Name: ");
			name = s.nextLine();
			s.nextLine();
		System.out.println("Enter Course name: ");
			course = s.nextLine();
			s.nextLine();
		totalStudents++;
		System.out.println("Data inserted successfully!");
	}
	public void show(){
		System.out.println("Student's Data below:");
		System.out.println("Roll Number = "+ roll+", ");
		System.out.print("Name = "+ name+", ");
		System.out.print("Pursuing = "+course+".");
	}
}
