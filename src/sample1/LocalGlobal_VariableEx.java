package sample1;

public class LocalGlobal_VariableEx {
	int b=20;                         // global variable or permanent variable
	
	public void m1()
	{
		
		int a=10;                  //local variable or temporary
		System.out.println(a);
		System.out.println(b);
		
	}
	public void m2()
	{
		
		System.out.println(b);
	}
     public static void main(String[] args) 
     {
    	 LocalGlobal_VariableEx d = new LocalGlobal_VariableEx();
    	 d.m1();
    	 d.m2();
		
	}

}
