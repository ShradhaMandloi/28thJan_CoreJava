package LogicalProgram;

public class SumOfNumPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="Sh5ubh3a7m";
	int count=0;
	for(int i=0; i<=s.length()-1;i++) {
		char c=s.charAt(i);
	if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9') {
		count =count+Character.getNumericValue(c);
	}
	
	}
	System.out.println(count);

	}

}
