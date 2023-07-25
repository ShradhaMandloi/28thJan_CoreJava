package LogicalProgram2;

public class CountLowerCaseAndUpperCaseOfString {
public static void main(String[] args) {
	
	String s1="ShrdahaMandloi@@";
	int lowcase=0;
	int upcase=0;
	int spccase=0;
	char ch[]=s1.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]>=65 && ch[i]<=90) 
		{
			lowcase++;
		}
		else if(ch[i]>=97 && ch[i]<=122)
		{
			upcase++;
		}
		else 
		{
			spccase++;
		}
	}
	System.out.println("LowerCase:"+lowcase);
	System.out.println("UpperCase:"+upcase);
	System.out.println("SpecialCharcter:"+spccase);
}
	
	
	
}
