package LogicalProgram2;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "my name is shradha";
		String [] st=str.split(" ");
		for(int i=0; i<=str.length()-1;i++) {
			String org=st[i];
			String rev=" ";
			for(int j=org.length()-1; j>=0; j--) {
				rev= rev+ org.charAt(j);
				
			}
			System.out.print(rev+" ");
		}
		
	}

}
