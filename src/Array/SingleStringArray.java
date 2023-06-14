package Array;

import java.util.Arrays;

public class SingleStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[4];
		a[0]="Shradha";
		a[1]="Lokesh";
		a[2]="Sarvesh";
		a[3]="Sourabh";
		
	//	String a[]= {"Shradha","Lokesh","Sarvesh","Sourabh"}; // for single line declaration  with initialization
		
		Arrays.sort(a);
		System.out.println(a.length);
		System.out.println("Ascending order");
		for(int i=0;i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Descending order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
