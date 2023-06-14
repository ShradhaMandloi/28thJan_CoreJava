package AccessSpecifiers;

public class ProtectedConstructor2 extends ProtectedConstructor{

	int c=20;
	void sub () {
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedConstructor2 a= new ProtectedConstructor2();
		a.add();
		a.sub();}

}
