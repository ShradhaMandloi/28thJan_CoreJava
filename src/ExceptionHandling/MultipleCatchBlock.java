package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Lokesh";
		try {
			System.out.println(s1.charAt(9));
		}
		catch(ArrayIndexOutOfBoundsException e) {                     // generic exception/super exception
			System.out.println("Array index out of bound Exception handled");
			
		}
		catch(StringIndexOutOfBoundsException e) {                     // generic exception/super exception
			System.out.println("String index out of bound Exception handled");
			
		}
		catch(Exception e) {                     // generic exception/super exception
												// java doesn't recommend that directly we use generic exception , in worst condition only 
												// we will use this when we dont know the exact type of exception 
			System.out.println("Exception handled");
			
		}
		System.out.println("Finally exceute");
	}

}