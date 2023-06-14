package Interface;



public class InterfaceClassEx2 implements InterfaceEx2{

	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		InterfaceClassEx2 i=new InterfaceClassEx2();
		i.add(10, 20);
	}
}
