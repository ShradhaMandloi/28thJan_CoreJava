package Inheritance;

public class MultilevelEx3 extends MultilevelEx2 {
	
	public void whatsappGif() {

		System.out.println("GIF Showing");
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelEx3 m1=new MultilevelEx3();
		m1.whatsappAC();
		m1.whatsappVC();
		m1.whatsappStatus();
		m1.whatsappPayment();
		m1.whatsappGif();
	
	}

}
