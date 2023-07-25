package LogicalProgram2;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="heart";
		String s2="earth";
		int count=0;
		
		char ch1 []= s1.toCharArray();
		Arrays.sort(ch1);
		char ch2 []= s2.toCharArray();
		Arrays.sort(ch2);
		for(int i=0;i<=4;i++) {
			if(ch1[i]==ch2[i])
			{
				count++;	
			}	
		}
		if(count==5)
		{
			System.out.println("String is an Anagram");	
		}
		else
		{
			System.out.println("String is not an Anagram");
		}
	}
}
