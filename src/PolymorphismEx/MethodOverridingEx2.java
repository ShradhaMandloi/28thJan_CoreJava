package PolymorphismEx;
      
    //acquiring super class method into sub class through extends and change the implementation/defination 
                        // of method according to the sub class requirement known as method overriding
public class MethodOverridingEx2 extends MethodOverridingEx {
	
	public void money() {
		
		System.out.println("all will be child property ");	//overriding
		}
	public void car() {                                     //overriding
		
		System.out.println("Car-BMW");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingEx2 a=new MethodOverridingEx2();   //binding of method declaration and definition is done at runtime based on object creation known as runtime polymorphism
		a.money();
		a.car();
		a.home();
	}

}
