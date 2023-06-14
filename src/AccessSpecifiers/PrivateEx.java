package AccessSpecifiers;


public class PrivateEx {
	// private int a;           //private members can be access throughout the class only 

	int b;                    //default members can be access throughout the package only 
	//private PrivateEx()
  //	{
		
		// a=10;
  //   }
	PrivateEx(){
		b=20;
	}
	//private void method1()
	//   {
		
	//	System.out.println(a);
	//  }
	
	void method1() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	//	PrivateEx m=new PrivateEx();
	//	m.method1();
	//	System.out.println(m.a);
		
		PrivateEx m1=new PrivateEx();
		m1.method1();
		System.out.println(m1.b);
	}
	
}
