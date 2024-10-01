public class Arrays {


	public static void main(String[] args) {
		

		int[] marks;
		marks = new int[5];

		int[] marks2 = new int[5];

		int[] marks3 = new int[] {1,2,3,55,22};

		marks2[0] = 44;


		for (int i=0; i<marks3.length; i++) {

			System.out.println(marks3[i]);
			
		}
	

		for(int value : marks3)
		{
			System.out.println(value);
		}
	}
}