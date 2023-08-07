package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is shradha is shradha is shradha";
		String [] s1= s.split(" ");
		//HashMap<String, Integer> hm= new HashMap();
		HashMap<Integer, String> hm= new HashMap<>();
		for(int i=0;i<=s1.length-1;i++) {
			String s2=s1[i];
			
			if(hm.containsKey(s2))
			{
				hm.put(s2, hm.get(s2)+1);
			}
			else
			{
				hm.put(s1,1);
			}
			
		}
		Set<String> allkeys=hm.keySet();
//		for(String Key:allkeys) 
//		{
//		System.out.println(Key+" "+hm.get(Key));
//		}
        //Print duplicate words in a statement/paragraph
		
		for(String Key:allkeys) {
	if(hm.get(Key)>1)
		
		System.out.println(Key+" "+hm.get(Key));
		
	}
	}
}
