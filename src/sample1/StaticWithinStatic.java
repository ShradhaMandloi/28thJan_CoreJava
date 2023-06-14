package sample1;

public class StaticWithinStatic {            //   regular method can be call within a method 
	
	static int a;
	int b;
	
	public static void m1(int a) {
		
		System.out.println(a*a);
	}
	public static void m2(int a) {
		
		System.out.println(a*a*a);
		m1(2);                              //  static method can be call within static method
	}
	
	public void m3(int b) {
		System.out.println(b*b);
		
	}
	public void m4(int b) {
		System.out.println(b*b*b);
		m3(4);                                // non static method can be call within non static method
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(2);
		m2(4);
		StaticWithinStatic c=new StaticWithinStatic();
		c.m3(4);
		c.m4(5);
	}

}
