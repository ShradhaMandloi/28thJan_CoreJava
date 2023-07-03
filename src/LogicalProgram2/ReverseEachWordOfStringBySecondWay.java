package LogicalProgram2;

public class ReverseEachWordOfStringBySecondWay {
	
	public static void main(String[] args)
		{
	
		String name= "my name is lokesh";
		String [] str= name.split(" ");
		for(int i =0; i<= str.length-1;i++) {
		
		String org=str[i];
		String rev= reverseString(org);
		System.out.print(rev+" ");
		
		}
		}

		private static String reverseString(String org) 
		{
		// TODO Auto-generated method stub
		String rev=" ";
		for(int j=org.length()-1; j>=0; j--) {
			 rev=rev+org.charAt(j);
		}
		return rev;
		
		}
	
}
