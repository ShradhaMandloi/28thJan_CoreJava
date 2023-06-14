package Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,40,60,30};    // for single line declaration  with initialization
		System.out.println("Print original array");
		for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
		Arrays.sort(a);
		System.out.println("Print array in ascending order");
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("Print array in descending order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	
	}

}
