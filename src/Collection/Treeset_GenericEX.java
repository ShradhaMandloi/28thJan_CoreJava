package Collection;

import java.util.TreeSet;

public class Treeset_GenericEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t= new TreeSet<Integer>();
		t.add(101);
		t.add(102);
		t.add(103);
		t.add(104);
		t.add(105);
		t.add(101);
		
		for(Integer t1:t) {
			System.out.println(t1);
		}
		
	}

}
