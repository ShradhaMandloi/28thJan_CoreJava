package Interface;

public class TestGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneralizedAirtel a=new GeneralizedAirtel();
		a.audioCalling();
		a.data();
		a.sms();
		a.Selffeature();
		
		GeneralizedJio b= new GeneralizedJio();
		b.audioCalling();
		b.data();
		b.sms();
		b.Selffeature();
		
		GeneralizedIdea c=new GeneralizedIdea();
		c.audioCalling();
		c.data();
		c.sms();
		c.Selffeature();
	}

}
