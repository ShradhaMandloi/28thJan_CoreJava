package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h= new HashSet();
		h.add("lokesh");
		h.add(101);
		h.add('a');
		h.add(null);
		h.add("lokesh");
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.remove(3);
		System.out.println(h);
		
		System.out.println("..................................");
		
		System.out.println("Print data using iterator.........");
		Iterator i= h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("...................................");
		System.out.println("Print data using for each loop.......");
		
		for(Object h1:h) {
			System.out.println(h1);
		}
		
		System.out.println("..................................");
		h.clear();
		System.out.println(h.size());	
		
	}

	

}
