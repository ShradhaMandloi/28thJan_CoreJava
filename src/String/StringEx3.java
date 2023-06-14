package String;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Velocity";
		String s2="abababa";
		String s3="My name is shradha";
		String s4="Training";
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s2.lastIndexOf('a'));
		
		System.out.println(s3.startsWith("My"));
		System.out.println(s3.endsWith("Shradha"));
		
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 7));    // it will not print last index character 
		
		System.out.println(s1.concat(s4));
		System.out.println(s1+s4);
		
		System.out.println(s3.replace("shradha", "lokesh"));
		
	}

}
