package AccessSpecifiers;

public class PrivateConstructor {
	int a;
	private PrivateConstructor(int a) {
		
		this.a=a;
	}
	void add() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		PrivateConstructor p= new PrivateConstructor(10);
		p.add();
	}
	
}
