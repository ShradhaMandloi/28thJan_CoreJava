package LogicalProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		boolean flag=true;
		if(num==1||num==0) {
			flag=false;
		}
		else{
			
			for(int i=2;i<=num/2;i++) {
				
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("not a prime number");
			}
		}
		
	}

}
