package String;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Velocity";
		String s2="";
		String s3=" ";
		String s4="abcd";
		String s5="ABCD";
		String s6=" my name is shradha";
		System.out.println(s1.length());
		
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println(s4.equals(s5)); // for information comparison and case also
		System.out.println(s4.equalsIgnoreCase(s5));  //for information comparison and ignore case 
		
		System.out.println(s4==s5);
		
		System.out.println(s6.contains("is"));
		System.out.println(s6.contains("name"));
		System.out.println(s6.contains("Name"));
		System.out.println(s6.contains(" "));
		
		System.out.println(s1.toUpperCase()); // not a permanent change
		System.out.println(s1);              // actual value still present 
		s1= s1.toUpperCase();
		System.out.println(s1);         //permanent change
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.charAt(2));
	}

}
