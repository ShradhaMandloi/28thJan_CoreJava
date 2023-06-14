package String;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Shradha";  //object creation without new keyword= store in constant pool area
		String s6="Shradha";                                                     //(duplicate variable not allowed for same info)
		String s2 = new String ("Shradha");   //object creation with new keyword= store in non constant pool area
	//  String s3="Sourabh1";											//(duplicate variables are allowed for same info)
		String s4= " Sourabh";
		String s5="";
		String s7=" ";
		System.out.println(s1=s2); //false because in diff pool
		System.out.println(s1=s6); //true because in same pool
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s4.length());
		
		System.out.println(s1.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s7.isEmpty());  //because of space it is showing false
	
	
	}

}
