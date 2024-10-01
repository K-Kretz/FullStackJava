public class Strings {

	public static void main(String[] args) {

//String literal
		String str1 = "Hello";
		System.out.println(str1);

//String Object
		String str2  = new String("World");
		System.out.println(str2);

//Concatinating STring literal and Object

		String str3 = str1 + str2;
		System.out.println(str3);

		
		//.length()
		System.out.println(str3.length());

		//.charAt()
		System.out.println(str3.charAt(0));

		//.concat()
		System.out.println(str1.concat(str1));

		//.substring()
		System.out.println(str3.substring(0, 5));

		//.equals()
		System.out.println(str1.equals(str2));

		//.contains()
		System.out.println(str3.contains("Hello"));


	}
}