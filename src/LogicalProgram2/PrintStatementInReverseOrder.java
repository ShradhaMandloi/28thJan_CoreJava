package LogicalProgram2;

public class PrintStatementInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="My Name Is Shradha";
		
		String [] s1=s.split(" ");
		System.out.println("............");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.println(s1[i]+" ");
		}
	}

}
