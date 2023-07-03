package LogicalProgram;

public class ReverseNumberSecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234;
		String original=Integer.toString(num);  // convert num to string
		
		String rev= " ";
		for(int i=original.length()-1; i>=0;i--) {
			
			rev= rev+original.charAt(i);
			
		}
		int revNum=Integer.parseInt(rev);  // convert string to number 
		System.out.println(revNum);
		
		
	}

}
