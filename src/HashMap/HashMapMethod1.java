package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapMethod1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<>();
		
		//1-put method -> to add key and value
		hm.put(101, "Shradha");
		hm.put(102, "Shruti");
		hm.put(103, "Pooja");
		
		System.out.println(hm);
		
		//2-put method-> update value of existing key
		hm.put(101, "Shraddha");
		System.out.println(hm);
		
		//3-ContainsKey method- to verify the key is present or not 
		System.out.println(hm.containsKey(104));
		
		//4-get method-to print value of particular key
		System.out.println(hm.get(102));
		
		//5-keyset method -all keys need to be print
		//System.out.println(hm.keySet());
		
		Set<Integer> allkeys=hm.keySet();
		for(Integer obj:allkeys)
		{
			System.out.println(obj);
		}
		
		//6-get all keys and value
		for(Integer obj2:allkeys) {
			System.out.println(obj2+"  "+hm.get(obj2));
		}
		
		//7-values method-to get all values 
		System.out.println(hm.values());	
	}
}
