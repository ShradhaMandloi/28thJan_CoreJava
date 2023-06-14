package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v= new Vector();
		v.add("Lokesh");
		v.add(101);
		v.add('a');
		v.add(null);
		v.add("Lokesh");
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(3));
		
		System.out.println("........................");

		v.add(2, 'A');
		System.out.println(v);
		
		System.out.println("...........................");
		
		v.remove(3);
		System.out.println(v);
		
		System.out.println("..........................");
		
		System.out.println("Print data using iterator.......");
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("...............................");
		
		System.out.println("Print data using list iterator.........");
		ListIterator litr=v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("................................");
	
		System.out.println("Print data using for loop............");
		for(int i=0;i<v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("...................................");
		
		System.out.println("Print data using for each loop...........");
		for(Object v1:v) {
			System.out.println(v1);
		}
		
		System.out.println("...................................");
		
		System.out.println("Print data using enumeration.........");
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("......................................");
		
		System.out.println(v.size());
		v.clear();
		System.out.println(v.size());
	}

}
