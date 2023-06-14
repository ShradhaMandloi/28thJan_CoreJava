package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList a=new ArrayList();            //by default 10 space memory area is reserved or bydefault capacity is 10
			
	//	ArrayList a=new ArrayList(8);
			a.add("Shradha");
			a.add(101);
			a.add(85.5);
			a.add('A');
			a.add(101);   //can store duplicate values
			a.add(null);
			a.add(null);
		

			
			System.out.println(a);
			System.out.println(a.size());
			System.out.println(a.isEmpty());
			System.out.println(a.get(2));
			System.out.println(a.get(4));
			
			// add elements in between arraylist  == right shift operation will work
			a.add(2, 102);
			System.out.println(a);
			
			//remove data from arraylist   == left shift operation will work
			
			a.remove(4);       
			System.out.println(a);
			
//			System.out.println("print data using iterator................");
//			
//			Iterator itr=a.iterator();
//			while(itr.hasNext()) {
//				System.out.println(itr.next());
//				
//			}
//			System.out.println("print data using list iterator.............");
//			ListIterator Litr=a.listIterator();
//			while(Litr.hasNext()) {
//				System.out.println(Litr.next());
//				
//			}
//			System.out.println("print data using for loop...........");
//		for(int i=0;i<=a.size();i++) {
//			System.out.println(a.get(i));
//			
//		}
		System.out.println("print data using for each loop.............");
		for(Object b1:a) {
			System.out.println(b1);
		}
		a.clear();
		System.out.println(a.size());
	}

}
