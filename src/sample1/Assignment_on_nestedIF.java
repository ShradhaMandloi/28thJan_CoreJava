package sample1;

public class Assignment_on_nestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  sa=750;

		if(sa>=500)
		{
	
			System.out.println("No Delivery Charges");
			if(sa>=10000) 
			{
		
		
			System.out.println("Additional 10% Discount");	
		    }
            else
            {
		
		    System.out.println("No Discount");
	    
            }
        }
       else
        {
	
	        System.out.println("Additional 50Rs you have to pay ");
            
        }

	}

}
