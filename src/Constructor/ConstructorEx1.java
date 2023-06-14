package Constructor;

public class ConstructorEx1 {                //user defined without parameter constructor
	
	int num1;
	int num2;
	
	ConstructorEx1(){                   // zero parameter constructor
		
		num1=10;
		num2=20;
	
		
	}

	
	public  void addition() {
		
		System.out.println("Addition is:" +" "+ num1+num2);
		
	}
	public void multiplication() {
		
		System.out.println("Multication is:" +" "+ num1*num2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx1 c1=new ConstructorEx1();    //constructor call from same class
		c1.addition();
		c1.multiplication();
		
		ConstructorEx2 c2=new ConstructorEx2();        ////constructor call from diff class
		c2.subtraction();
		
	}

}
