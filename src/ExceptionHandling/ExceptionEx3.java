package ExceptionHandling;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int div=0;
		try {
			
			div=a/b;
		}
		catch(ArithmeticException e) {
			
		//	div=a/1;
			System.out.println("Exception Handled");
			
		}
		System.out.println(div);
		System.out.println("Finally Block");
		
	}

}
