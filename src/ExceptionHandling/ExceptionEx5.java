package ExceptionHandling;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Lokesh";
		
		try {
			System.out.println(s1.charAt(9));
		}
		catch(Exception e) {                  // generic exception/super exception
			                            
			e.printStackTrace();            // use to know the exact type of exception
			System.out.println("Exception handled");
		}
		System.out.println("Finally exceute");
	}

}
