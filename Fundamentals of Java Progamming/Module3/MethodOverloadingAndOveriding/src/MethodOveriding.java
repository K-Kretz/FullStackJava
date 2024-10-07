class ParentClass{
	public void dance(){
		System.out.println("Im the parent class being overriden");
	}

}

class ChildClass extends ParentClass{
	public void dance(){
		super.dance();
		System.out.println("Im overridiing this method");
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		
		ChildClass cl = new ChildClass();
		cl.dance();
	}

	
}