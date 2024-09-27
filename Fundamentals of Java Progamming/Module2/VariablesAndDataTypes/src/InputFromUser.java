import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		System.out.println("Give me a name: ");
		//Scanner most used Input method
		Scanner scanner1 = new Scanner(System.in);

		//.next() returns the next token from the Scanner
		String name = scanner1.next();
		System.out.println("Name is " + name);

		//.nextLine() Moeves the Scannner position to the next line and returns the value as a string
		String nameLine = scanner1.nextLine();
		System.out.println("Name is " + nameLine);

		//.nextByte() Scans the next token as a byte
		Byte ageByte = scanner1.nextByte();
		System.out.println("Age is " + ageByte);

		//.nextShort() Scans the next token as a short value
		Short ageShort = scanner1.nextShort();
		System.out.println("Age is " + ageShort);

		//.nextInt() Scans the next token as a int value
		int ageInt= scanner1.nextInt();
		System.out.println("Age is " + ageInt);

		scanner1.close();
	}
}