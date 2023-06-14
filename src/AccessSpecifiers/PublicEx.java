package AccessSpecifiers;

public class PublicEx { //public members can be call throughout the project
	public int a;
	
	public PublicEx(){
		
		a=50;
	}
	public void method3() {
		
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicEx n4=new PublicEx();
		n4.method3();
		System.out.println(n4.a);
	}

}
