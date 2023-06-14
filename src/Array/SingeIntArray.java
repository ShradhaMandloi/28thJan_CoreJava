package Array;

public class SingeIntArray {
	 public static void main(String[] args) {
		 int a[]= new int [4];
		 a[0]=30;
		 a[1]=20;
		 a[2]=40;
		 a[3]=10;
		 System.out.println("Print original info");
		 for(int i=0; i<=a.length-1;i++) {
			 
			 System.out.print(a[i]+" ");
			 
		 }
		 System.out.println("Print array in reverse order");
	
		 for(int i=a.length-1; i>=0;i--) {
			 
			 System.out.println(a[i]);
			 
		 }
		 
	 
	 }
}
