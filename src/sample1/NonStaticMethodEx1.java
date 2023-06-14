package sample1;

public class NonStaticMethodEx1 {
	// non static method call from same method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hii");
NonStaticMethodEx1 s= new NonStaticMethodEx1();
s.m1();
s.m2();
NonStaticMethodEx2 s2= new NonStaticMethodEx2();
s2.m3();
s2.m4();


	}
public void m1() {
	
	System.out.println("running m1 of same class ");
}
public void m2() {
	
	System.out.println("running m2 of same class");
}
	
}
