package ExceptionHandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shradha";
		int a[]= {10,20,50,40,60};
		try {
			
			try {
				System.out.println(s.charAt(9));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Exception handled");
			}
			System.out.println(a[7]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("array index out of bound exception handled");
		}
		System.out.println("Finally execute");
	}

}
