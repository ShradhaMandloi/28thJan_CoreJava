package sample1;

public class StaticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//static method call from same class
		
 m1();
 
 //static method call from diff class
 
 StaticEx2.m5();
 
 //non static call from same class
 StaticEx1 s= new StaticEx1();
 s.m2();
 
 //non static call from diff class
 
 StaticEx2 s2= new StaticEx2();
 s2.m6();
 s2.m7();
 
 
}
public static void m1() {                // method without parameter
		
		System.out.println("running m1");
	}
public void m2() {                     // method without parameter
	
	System.out.println("running m2");
}



}
