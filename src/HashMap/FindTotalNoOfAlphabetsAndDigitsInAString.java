package HashMap;

public class FindTotalNoOfAlphabetsAndDigitsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="@Shr123adha#";
		int spaceCount=0;
		int letterCount=0;
		int digitCount=0;
		int specialCharCount=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char s1=s.charAt(i);
			if(Character.isLetter(s1)) {
				
				letterCount ++;
			}
			else if(Character.isDigit(s1)) {
				digitCount++;
			}
			else if(Character.isWhitespace(s1)) {
				spaceCount++;
			}
			else {
				specialCharCount++;
			}
		}
		
		System.out.println("Letter Count:"+ letterCount);
		System.out.println("Digit Count:"+ digitCount);
		System.out.println("Space Count:"+ spaceCount);
		System.out.println("Special Character Count:"+ specialCharCount);

		
	}

}
