public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] arr = {
					{34,645,23,123,66},
					{67,67,34,66,23},
					{1,3,6,8,4}
		};


		for (int i=0; i<3; i++) 
		{
			for (int k=0; k<5; k++) 
			{
				System.out.print(arr[i][k] + "\t");

				
			}
			System.out.println();
			
		}
	}

}