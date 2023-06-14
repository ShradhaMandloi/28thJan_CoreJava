package sample1;

public class NonStaticVariableEx {

	int c=30;           //non static global variable
	
	
	public static void m1() {
		NonStaticVariableEx a2 = new NonStaticVariableEx();   // non static variable can be call in static method by creating object
		System.out.println(a2.c);
	
		
	}
	public void m2() {
		System.out.println(c);  // non static variable can be call directly within non static method
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                            //non static global variable call from same class
		NonStaticVariableEx a=new NonStaticVariableEx();
		System.out.println(a.c);
		a.m2();
		m1();
		                            //non static global variable call from diff class
		NonStaticVariableEx2 b=new NonStaticVariableEx2();
		System.out.println(b.d);
		System.out.println(b.e);
	
	
	}

}
