package PolymorphismEx;

public class MethodOverLoadingEx {                   //compiletime polymorphism
	int a,b,c;                                        //binding of declaration and definition of method is based on input parameter passes during compile time is known as early binding or compiletime polymorphism
	
		
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	public void add(int a, int b,int c) {     //a class contain multiple same method with diff argument/parameter known as method overloading
		
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MethodOverLoadingEx m=new MethodOverLoadingEx();
		m.add(10, 20);
		m.add(10, 20, 30);
	}
	
}
