package AccessSpecifiers2;

import AccessSpecifiers.ProtectedEx;

public class ProtectedEx3 extends ProtectedEx { //protected members can be call outside the package by using inheritance i.e. by using extends keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedEx3 n3=new ProtectedEx3();
		n3.method2();
		System.out.println(n3.a);
	}

}
