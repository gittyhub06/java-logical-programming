package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	int marks;
	String email;
	String city;
	
	public Student(String name, String email, String city, int marks) {
		this.name=name;
		this.email=email;
		this.city=city;
		this.marks=marks;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", email=" + email + ", city=" + city + "]";
	}

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Email "+email);
		System.out.println("City "+city);
		System.out.println("Marks "+marks);
		System.out.println("===============");
	}
}

public class Assignment_1 {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Student> student=new ArrayList<Student>();
		System.out.println("Enter no of students");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details of student "+i);
			System.out.println("Name");
			String name=sc.nextLine();
			sc.nextLine();
		    System.out.println("Email");
		    String eamil=sc.nextLine();
		    sc.nextLine();
		    System.out.println("City");
		    String city=sc.nextLine();
		    sc.nextLine();
		    System.out.println("Marks");
		    int marks=sc.nextInt();
		    sc.nextLine();
		    System.out.println("=================");
		    Student st=new Student(name, city, eamil, marks);
		    student.add(st);
		}
		for(int j=0;j<n;j++) {
			System.out.println(student.get(j)); 
		}
		
	}
	
}

