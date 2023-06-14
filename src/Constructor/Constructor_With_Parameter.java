package Constructor;

public class Constructor_With_Parameter {
	int a;
	int b;
	
	Constructor_With_Parameter(int aa, int bb){
		a=aa;
		b=bb;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_With_Parameter c1= new Constructor_With_Parameter(10,20);
		Constructor_With_Parameter c2= new Constructor_With_Parameter(20,40);
		c1.addition();
		c1.multiplication();
		c2.addition();
		c2.multiplication();
		
		ConstructorWithParameterEx2 c3=new ConstructorWithParameterEx2(10,5);
		c3.sub();
		ConstructorWithParameterEx2 c4=new ConstructorWithParameterEx2(10,4);
		c4.sub();

	}
	public void addition() {
		
	System.out.println(a+b);	
		
	}
	public void multiplication() {
		
		System.out.println(a*b);	
			
		}
	
	
}
