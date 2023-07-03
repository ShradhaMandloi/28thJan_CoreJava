package LogicalProgram2;

public class CountNumberOFSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a b cd e";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char s1=s.charAt(i);
			if(s1 ==' ') {
				count++;
			}
			
		}
		System.out.println("Total Number Of Count:"+ count);
	}

}
