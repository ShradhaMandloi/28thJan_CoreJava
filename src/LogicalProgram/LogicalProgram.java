package LogicalProgram;

public class LogicalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,100};
		int b[]= {10,20,70,80,100};
		for(int i=0; i<=4;i++) {
			if(a[i]!=b[i]) {
				System.out.println(a[i]+" "+b[i]);
			}
		}
	}

}
