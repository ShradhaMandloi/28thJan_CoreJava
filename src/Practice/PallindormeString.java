package Practice;

public class PallindormeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="level";
	
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not a pallindrome");
		}
	}

}
