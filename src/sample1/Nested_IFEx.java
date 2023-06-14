package sample1;

public class Nested_IFEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preexam= 350;
		int mains=850;
		if(preexam>=300)
		{
			System.out.println("Eligible for mains exam");
			if(mains>=800) {
				
				System.out.println("mains cleared");
				
			     }
			    else if(mains>700 & mains<=750) 
		     	{
				
				System.out.println("You are in waiting list");
				
		     	}
			else {
				System.out.println("mains not cleared");
				
			     }
			
		 }
	else {
			
			System.out.println("Not eligible for mains");
			
		 }
	}

}
