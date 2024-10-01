import java.util.Scanner;

public class Student {
	

	//characteristics
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);

	//Behaviors
	public void acceptDetails() {
		System.out.println("Enter Student Id: ");
		studentId = scanner.nextInt();
		System.out.println("Enter Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Student Age: ");
		studentAge = scanner.nextInt();
		scanner.close();
	}
	public void displayDetails() {
		System.out.println("Student ID: " + studentId + "\n" +
							"Student Nanme: " + studentName + "\n" +
							"Student Age: " + studentAge);
	}
}