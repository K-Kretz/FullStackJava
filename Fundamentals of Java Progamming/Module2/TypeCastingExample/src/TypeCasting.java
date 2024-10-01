import java.util.*;
import java.awt.*;

public class TypeCasting {

	public static void main(String[] args) {
		//
		int intValue = 100;

		//implicit Type casting
		long longValue = intValue;
		double doubleValue = longValue;

		System.out.println(intValue + longValue + doubleValue);
	

		//explicit type casting
		double doubleValue1 = 100.56;
		//int intValue1 = doubleValue1;
		//Above wont work since the memory size of int is smaller than double
		//must Type cast explicit

		int intValue1 = (int)doubleValue1;


		Point p1 = new Point(1,2);

		Point p2 = p1;

		System.out.println(p1.getX());
		System.out.println(p2.getX());

		p2.setLocation(2, 1);

		System.out.println(p1.getX());
		System.out.println(p2.getX());

		p1.setLocation(3, 1);

		System.out.println(p1.getX());
		System.out.println(p2.getX());
	}
}