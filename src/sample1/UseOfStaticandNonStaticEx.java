package sample1;

public class UseOfStaticandNonStaticEx {

	
	String EmpName;               //non static is used to maintain diff values
	// String CeoName;
	int EmpId;
	static String CeoName;                        // static is use to store/maintain latest value
	
	public void InfoPrint() {
		
		System.out.println("Information of EMployee:-"+ EmpId+" "+EmpName+" "+CeoName);
	}
	

}
