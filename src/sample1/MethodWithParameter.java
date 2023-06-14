package sample1;

public class MethodWithParameter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(10,10); 
		addition(20,10);                        // argument passing
		System.out.println();
		
		MethodWithParameter m= new MethodWithParameter();
		m.multiplyandsubtraction(20,10);
		System.out.println();
		m.multiplyandsubtraction(4, 2);
		System.out.println();
		
		student("Shradha");
		student("Lokesh");
		System.out.println();
		
		student2("Shradha", "Mandloi");
		student2("Lokesh","Mandloi");
		
		System.out.println();
		
		MethodWithParameter2.studentinfo(10, "Shradha", 80.9f);
		MethodWithParameter2.studentinfo(20, "Lokesh", 85.5f);
		
		System.out.println();
		
		MethodWithParameter2 m2 = new MethodWithParameter2();
		m2.Teacher(10, "Sandhya");
		m2.Teacher(11, "Shradha");
		
	}
	
	// method with parameter
	public static void addition(int a, int b) // argument declaration
	{                    
		 
		System.out.println("addition of 2 no's : "+ (a+b));
	}
	public void multiplyandsubtraction(int a, int b)                    // argument declaration
	{                    
		 
		 
		 System.out.println("multiplication of 2 no's : "+ (a*b));
		System.out.println("subtraction of 2 no's :"+ (a-b));
	}
	public static void student(String name)                          // argument declaration
	{                    
		 
		System.out.println(name);
	}
	public static void student2(String firstname, String lastname)                 // argument declaration
	{                    
		 
		System.out.println("Student Name : "+ firstname+" "+lastname);
	}
	

}
