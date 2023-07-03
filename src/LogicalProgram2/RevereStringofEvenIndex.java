package LogicalProgram2;

public class RevereStringofEvenIndex {
	public static void main(String[] args) 
	{
		
		String s1="my name is abc";    
		
		
		String [] ar=s1.split(" ");  
		//           0<=3  
		for(int i=0; i<=ar.length-1; i++)      //0-3
		{				// 0
			String org = ar[i];  
			if(i%2==0) {                          // for odd (i%2!=0)
				
				String rev= reverseString(org);
				
				System.out.print(rev+" ");
			}
			else {
				System.out.println(org+" ");
			}
			
		}
	}
	
	public static String reverseString(String org) 
	{
		String rev="";
		for(int j=org.length()-1; j>=0; j--) 
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
}
