package ThisAndSuper;

public class ThisAndSuperEx extends ThisAndSuperEx2{

	int a=20;
	
	
	public void m1() {
		
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		
		ThisAndSuperEx a1= new ThisAndSuperEx();
		a1.m1();
		a1.m2();
		
		
	}
	
}
