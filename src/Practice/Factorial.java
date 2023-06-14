package Practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5*4*3*2*1=120
		
		int fact=1; 
		int num=5;
		
		for(int i=5;i>=1;i--) {
			
	
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
