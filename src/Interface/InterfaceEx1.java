package Interface;

public interface InterfaceEx1 {        // 100% abstract class is interface that means it contains incomplete methods only.
			
	int a=50;                            // by default static and final
	                                         //by default all methods are public and abstarct
	abstract public void m1();
	abstract public void m2();            // or void m2();   is also correct
                                         	//constructor is not present in this interface concept 
	                           // can't create object of interface because constructor is not present and also bcoz of incomplete method 
										//for object creation of interface we need to create implementation class by using implements keyword
								// interface resolve amiguity problem and support multiple inheritance
	
	
	
	
	
}											
