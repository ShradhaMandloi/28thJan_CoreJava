package LogicalProgram;

import java.util.Scanner;

public class AcceptFromUserAndAddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scan.nextInt();
		System.out.println(num*num);
		
		System.out.println("Enter number2: ");
		int num1=scan.nextInt();
		System.out.println(num1+num1);
		
		System.out.println("Enter Name: ");
		String name= scan.next();
		System.out.println(name.toUpperCase());
		
	}

}
