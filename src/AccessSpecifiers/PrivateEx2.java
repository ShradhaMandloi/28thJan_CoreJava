package AccessSpecifiers;

public class PrivateEx2 {

	
	public static void main(String[] args) {
		
	//	PrivateEx m1=new PrivateEx();      //cannot call private constructor
		// m1.method1();                                 //cannot call private method
	//	System.out.println(m1.a);       //cannot call private variable
	
		PrivateEx m2=new PrivateEx();    //default constructor can be call within the package
		m2.method1();                     //default method can be call within the package
		System.out.println(m2.b);   		//default variable can be call within the package
	
	}
}
