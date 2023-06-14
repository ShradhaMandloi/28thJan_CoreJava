package Inheritance;

public class HierarichicalEx {
	
	public void fatherCar() 
	{
		System.out.println("Father Car");
	}
    public void fatherHome() {
		
		System.out.println("Father Home");
	}
    public void fatherBike() {
		
		System.out.println("Father Bike");
	}
    public static void main(String[] args) 
	{
		HierarichicalEx m=new HierarichicalEx2();
		m.fatherCar();
		m.fatherHome();
		m.fatherBike();
		
		
		
	}
	
}
