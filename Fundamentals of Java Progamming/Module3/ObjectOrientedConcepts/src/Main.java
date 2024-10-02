public class Main {

	public static void main(String[] args) {
	//Class example
		// Student s1 = new Student();
		// s1.acceptDetails();
		// s1.displayDetails();

	//Encapsulation with getters and setters
		// Encapsulation e1 = new Encapsulation();

		// e1.setFirstName("Keith");
		// e1.setLastName("Brown");

		// System.out.println(e1.getFirstName() + " " + e1.getLastName());

	//Inheritance between classes
		// InheritanceChild ic = new InheritanceChild();
		// ic.acceptDetails();
		// ic.displayDetails();

	//UpCasting and DownCasting
		
		//UpCasting
		//Upcasting will be done internally and due to upcasting the object is allowed 
		//to access only parent class members and child class specified members (overridden methods, etc.) but not all members.
		UpAndDownCastingParent parent2 = new UpAndDownCastingChild();
		parent2.drive();

		//DownCasting
		//Downcasting has to be done externally and due to downcasting a child object can acquire the properties of the parent object.
		UpAndDownCastingChild child1 = (UpAndDownCastingChild)parent2;

		child1.drive();
		child1.speedUp();



	}
}