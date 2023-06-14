package Constructor;

public class MultipleConstructorEx {


	int num1;
	int num2;
	String name;
	
	MultipleConstructorEx(){
		
		num1=10;
		num2=20;
		
	}
	MultipleConstructorEx(int a,int b){
		
		num1=a;
		num2=b;
		
	}
	MultipleConstructorEx(String n){
		name=n;
		
	}
MultipleConstructorEx(int a,int b, String n){
		
		num1=a;
		num2=b;
		name=n;
		
	}

	public  void addition() {
		
		System.out.println("Addition is:"+" "+(num1+num2));
		
	}
	public void show() {
		
		System.out.println(name);
	}
	public void print() {
		
		System.out.println(num1+" "+num2+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleConstructorEx c1=new MultipleConstructorEx();    //constructor call from same class
		c1.addition();
		MultipleConstructorEx c2=new MultipleConstructorEx(10,2);
		c2.addition();
		MultipleConstructorEx c3=new MultipleConstructorEx("Shraddha");
		c3.show();
		MultipleConstructorEx c4=new MultipleConstructorEx(10,20,"Shraddha");
		c4.print();
		
	}

}
