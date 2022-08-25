package programs;

public class first {

	public static void main(String[] args) {
		
		System.out.println("hello");		
		demoFunctional ref= () -> System.out.println("disp method");
		
		ref.disp();
		ref.print();
	}

}
