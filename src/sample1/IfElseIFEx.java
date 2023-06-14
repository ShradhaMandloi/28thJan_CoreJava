package sample1;

public class IfElseIFEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks=32;
		 if(marks>=65) {
			 
			 System.out.println("Distinction");
		 }
		 else if(marks>=60 & marks<=64){
			 
			 System.out.println("Ist class");
		 }
		 else if(marks>=50 &marks<=59) {
			 
			 System.out.println("2nd class");
		 }
		 else if (marks>=40 & marks<=49) {
			 
			 System.out.println("3rd class");
		 }
		 else if(marks>=33 & marks<=39) {
			 
			 System.out.println("Pass");
		 }
		 else {                                        //or else if(marks<33)
			 
			 System.out.println("Fail");
		 }
		 
	}

}
