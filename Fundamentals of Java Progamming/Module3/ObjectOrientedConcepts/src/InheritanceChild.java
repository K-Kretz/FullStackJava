import java.util.*;

public class InheritanceChild extends InheritanceParent{

	private float objectiveMarks;
	private float subjectiveMarks;


	void acceptDetails() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Student ID: ");
		setStudentID(s.next());

		System.out.println("Enter Student Name: ");
		setStudentName(s.next());

		System.out.println("Enter Student Age: ");
		setStudentAge(s.nextInt());
	}

	public void displayDetails(){
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Student Name: " + getStudentName());
		System.out.println("Student Age: " + getStudentAge());
	}
}