package LogicalProgram2;

public class ReversetheGivenAlphaNumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String originalString = "abcd13pop12ptr";
		        String reversedString = "";

		        for (int i = originalString.length() - 1; i >= 0; i--) {
		            reversedString += originalString.charAt(i);
		        }

		        System.out.println(reversedString);
		    }
		
	}


