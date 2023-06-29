package LogicalProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=153, temp=a;
		int rem;
		int j,k=0;
		
		while(a!=0) {
			
			rem=a%10;  //3
			j=rem*rem*rem;  //27
			k=k+j;  //0+27=27
			a=a/10; //15
		}
		
		if(k==temp) {
			System.out.println("No is armstrong no.");
		}
		else
		{
			System.out.println("No is not an armstrong no.");
		}
		
	}

}
