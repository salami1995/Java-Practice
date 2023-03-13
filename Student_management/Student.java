package Student_management;
//import java.util.Scanner;

public class Student {
	private String fullName;
	private int age;
	private String hometown;
	private int classStudent;

	public Student(String fullName, int age, String hometown, int classStudent) {
		this.fullName = fullName;
		this.age = age;
		this.hometown = hometown;
		this.classStudent = classStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public String getHometown() {
		return hometown;
	}

	public int getClassStudent() {
		return classStudent;
	}

	public void displayInfo() {
		System.out.println("=== Student Info ===");
		System.out.println("Full name: " + fullName);
		System.out.println("Age: " + age);
		System.out.println("Hometown: " + hometown);
		System.out.println("Class: " + classStudent);

	}
}
