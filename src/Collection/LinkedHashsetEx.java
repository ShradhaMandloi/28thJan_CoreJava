package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated metlhod stub
       LinkedHashSet lh=new LinkedHashSet();
        lh.add("lokeslh");
		lh.add(101);
		lh.add('a');
		lh.add(null);
		lh.add("lokeslh");
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		
		lh.remove(2);
		System.out.println(lh);
		
		System.out.println("..................................");
		
		System.out.println("Print data using iterator.........");
		Iterator i= lh.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("...................................");
		System.out.println("Print data using for each loop.......");
		
		for(Object h1:lh) {
			System.out.println(h1);
		}
		
		System.out.println("..................................");
		lh.clear();
		System.out.println(lh.size());	
	}

	

}
