package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t= new TreeSet();
		t.add(101);
		t.add(102);
		t.add(103);
		t.add(104);
		t.add(105);
		t.add(101);
		
		System.out.println(t);
		System.out.println(t.isEmpty());
		System.out.println(t.size());
		
		t.remove(102);
		System.out.println(t);

		System.out.println("........................");
		System.out.println(t.first());
		System.out.println(t.last());
		
		t.pollFirst();
		System.out.println(t);
		
		System.out.println(".............................");
		
		Iterator itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("...............................");
		
		System.out.println("Print data using for each loop........");
		
		for(Object t1:t) {
			System.out.println(t1);
		}

	
	}

}
