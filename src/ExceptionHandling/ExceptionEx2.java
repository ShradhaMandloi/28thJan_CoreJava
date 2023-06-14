package ExceptionHandling;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40};
		
		try {
			
			System.out.println(ar[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(ar[0]);
			System.out.println("Exception Handled");
		}
		
		System.out.println("Final block");
	}

}
