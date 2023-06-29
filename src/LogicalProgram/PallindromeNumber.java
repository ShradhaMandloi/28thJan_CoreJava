package LogicalProgram;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12121;
		int rem,rev=0;
		int temp=a;
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(temp==rev) {
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not a pallindrome");
		}
	}
	
}


