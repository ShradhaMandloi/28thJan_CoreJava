package ExceptionHandling;

public class ExceptionEx4 {      //we can use multiple catch block with single try block

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shradha";
		try {                     // we can't mention multiple risky code in single try block , it can't be execute
			System.out.println(s.charAt(9));
		}
		catch(ArrayIndexOutOfBoundsException e){              // object name can be same or different
			System.out.println("array index out of bound exception handled");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bound exception handled");
		}
		catch(ArithmeticException e1) {
			System.out.println("arithmetic exception handled");
		}
		
		System.out.println("Finally executed");
	}

}
