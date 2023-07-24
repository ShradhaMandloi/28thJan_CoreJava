package HashMap;

import java.util.HashMap;

import java.util.Set;

public class HashMap_OccurenceOFEachCharInAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ababababb";
		HashMap<Character, Integer> hm= new HashMap();
		
			for(int i=0;i<=s.length()-1;i++) {
				char s1=s.charAt(i);
				if(hm.containsKey(s1)) {
					
					hm.put(s1, hm.get(s1)+1);
				}
				else {
					hm.put(s1, 1);
				}
			}
		Set<Character> allkeys=hm.keySet();	
		
		for(Character key:allkeys) 
		{
			System.out.println(key+"-"+hm.get(key));
		}
		
		}
	
	}


