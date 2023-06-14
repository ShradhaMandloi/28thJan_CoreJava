package Inheritance;

public class HierarichicalEx2 extends HierarichicalEx{
    
	public void SonCar()
     {
		
		System.out.println("Son having father Car");
	 }
	 public static void main(String[] args) 
		{
			HierarichicalEx2 m=new HierarichicalEx2();
			m.fatherCar();
			m.fatherHome();
			m.fatherBike();
			m.SonCar();
			
			HierarichicalEx3 m1=new HierarichicalEx3();
			m1.fatherCar();
			m1.fatherHome();
			m1.fatherBike();
			m1.DaughterCar();
			
			
		}
}
