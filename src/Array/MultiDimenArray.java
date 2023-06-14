package Array;

public class MultiDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[][]=new int[2][3];
//		a[0][0]=10;
//		a[0][1]=50;
//		a[0][2]=20;
//		a[1][0]=30;
//		a[1][1]=40;
//		a[1][2]=60;
//		
		int a[][]= { {10,20,30} ,{40,50,60}};          // second way to initialize objet
		System.out.println("print index of a[1]2j] :"+a[1][2]);
		
		for(int i=0;i<=1;i++) {
			for(int j=0; j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
