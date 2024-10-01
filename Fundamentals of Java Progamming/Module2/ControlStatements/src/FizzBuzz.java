import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Total number of Students: ");
		Scanner scan = new Scanner(System.in);
		scan.close();

		int[] totalStudents = new int[scan.nextInt()];

		for (int i=1; i<=totalStudents.length; i++) 
		{
			if(i%3 == 0 && i%5 == 0)
				System.out.println("FizzBuzz");
			else if(i%3 == 0)
				System.out.println("Fizz");
			else if(i%5 ==0)
				System.out.println("Buzz");
			else
				System.out.println(i);

		}


	}
}