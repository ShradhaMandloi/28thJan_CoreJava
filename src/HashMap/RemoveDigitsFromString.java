package HashMap;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Shr123adha";
		String s2="";
		for(int i=0;i<=s.length()-1;i++){
		char s1=s.charAt(i);
		
		if(Character.isDigit(s1)) {
				
		}
		else {
			s2=s2+s1;
		}
		
		}
		System.out.println(s2);
		
	}

}
