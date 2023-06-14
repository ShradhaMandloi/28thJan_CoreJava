package ExceptionHandling;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcd";
		try {
			
			System.out.println(s.charAt(6));      //if this will execute then catch block will also
			                                                //execute becoz of exception need to be handle
			
			//System.out.println(s.charAt(2));    // if this will execute then output will print
			                                                //catch block will not execute bcoz of no error
		}
		catch(StringIndexOutOfBoundsException e)
		{
			
		System.out.println("Exception Handled");	
		}
		
		System.out.println("finally Executed");
	}

}
