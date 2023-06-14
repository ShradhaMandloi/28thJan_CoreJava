package sample1;

public class UseOfStaticandNonStaticEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfStaticandNonStaticEx e1=new UseOfStaticandNonStaticEx();
		e1.EmpName="Lokesh";
		e1.EmpId=101;
	//	e1.CeoName="Shradha";
		UseOfStaticandNonStaticEx.CeoName="Shradha";
	
		UseOfStaticandNonStaticEx e2=new UseOfStaticandNonStaticEx();
		e2.EmpName="Sourabh";
		e2.EmpId=102;
	//	e2.CeoName="Shradha";
		UseOfStaticandNonStaticEx.CeoName="Shradha";
		
		UseOfStaticandNonStaticEx e3=new UseOfStaticandNonStaticEx();
		e3.EmpName="Sarvesh";
		e3.EmpId=103;
	//	e3.CeoName="Rishi";
		UseOfStaticandNonStaticEx.CeoName="Rishi";
		
		e1.InfoPrint();
		e2.InfoPrint();
		e3.InfoPrint();
	}

}
