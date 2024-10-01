public class StringBuilder1 {

	public static void main(String[] args) {
		//append() add end
		//insert() insert anywhere
		//delete() remove chars at buffer
		//reverse() reverse order of chars in buffer

		// StringBuffer buffer = new StringBuffer();
		// System.out.println(buffer.capacity());

		// buffer.append("Hello Word");
		// System.out.println(buffer);



		// //With a lack of thread safety cann't be used by multiple threads compared to StringBuffer()
		// StringBuilder sb = new StringBuilder("Hello ");
		// System.out.println(sb.capacity());
		// sb.append("world");
		// System.out.println(sb);


		StringBuffer buffer = new StringBuffer("Hello ");

		Long start1Time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			buffer.append("word");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis()-start1Time));

		



		StringBuilder builder = new StringBuilder("Hello ");

		Long start2Time = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			builder.append("word");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis()-start2Time));
	}
}