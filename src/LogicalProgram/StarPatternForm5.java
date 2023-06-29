package LogicalProgram;

public class StarPatternForm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
		}
	}

}
