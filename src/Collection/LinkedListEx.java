package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Lokesh");
		l.add(101);
		l.add('a');
		l.add(null);
		l.add("Lokesh");
		l.add(null);
	
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.get(2));
		
		System.out.println("............................");
		
		//update/modify
		l.set(4,"shradha");
		System.out.println(l);
		
		//add element
		l.add(2,'A');
		System.out.println(l);
		
		System.out.println(".............................");
		
		l.remove(5);
		System.out.println(l);
		
		System.out.println("..............................");
		
		System.out.println("Print data using iterator.........");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(".....................................");
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("................................");
	
		System.out.println("Print data using for loop............");
		for(int i=0;i<l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("...................................");
		
		System.out.println("Print data using for each loop..........");
		
		for(Object l1:l) {
			System.out.println(l1);
		}
		System.out.println("........................");
		l.clear();
		System.out.println(l);
	
	}

	
}
