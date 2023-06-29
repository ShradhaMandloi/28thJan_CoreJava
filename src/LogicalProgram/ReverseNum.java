package LogicalProgram;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2456;                                         //int reverse=0,rem; num=2456;
		int reverse=0;
		while(num!=0) {                                       //2456!=0
			 
			int rem=num%10;                                   // rem=6
			reverse=reverse*10+rem;                           // reverse=6
			num=num/10;                                       // num=245
			
		}
		System.out.println("reverse no is:-"+ reverse);
		
	}

}
