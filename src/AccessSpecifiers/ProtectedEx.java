package AccessSpecifiers;

public class ProtectedEx {

	protected int a;
	
	protected ProtectedEx(){
		
		a=10;
	}
	protected void method2() {
		
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		ProtectedEx n= new ProtectedEx();
		n.method2();
		System.out.println(n.a);
	}
	
}
