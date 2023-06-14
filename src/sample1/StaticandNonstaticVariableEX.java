package sample1;

public class StaticandNonstaticVariableEX {

	static int a=10;   // static global variable
	
	public static void main(String[] args) {
		System.out.println(a);                       //calling static global variable from same class
		
		System.out.println(StaticandNonstaticVariableEX2.c);   //calling static global variable from diff class
		
		m1();
		StaticandNonstaticVariableEX b= new StaticandNonstaticVariableEX();
		b.m2();
		
	
	}
	public static void m1() {
		System.out.println(a);
		System.out.println(StaticandNonstaticVariableEX2.c);
	}
	public void m2() {
		
	System.out.println(a);	
	}
	
	
	
}
