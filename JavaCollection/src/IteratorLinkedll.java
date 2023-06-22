import java.util.LinkedList;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorLinkedll {
	
	

	void linkedll (LinkedList<Integer> ll) {
		
		Iterator <Integer> ab = ll.iterator();
		
		while (ab.hasNext()) {
			
			int val = ab.next();
			System.out.println("The element in LinkedList "+val);
			
		}
		System.out.println();
		
	}
	
	
	void arrayList (ArrayList<Float> Arr) {
		
		Iterator<Float> itr = Arr.iterator();
		
		while (itr.hasNext()) {
			Float b = itr.next();
			
			System.out.println("the element in ArrayList "+b);
		}
		System.out.println();
	}
	
	void VectorList(Vector <String> st) {
		
		
		Iterator<String > itr = st.iterator();
		
		while (itr.hasNext()) {
			
			String ad = itr.next();
			System.out.println("the element in vector " +ad);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList <>();
		ll.add(80);
		ll.add(80);
		ll.add(49);
		ll.add(23);
		ll.add(29);
		
		ArrayList<Float> Arr = new ArrayList<>();
		Arr.add(14f);
		Arr.add(74f);
		Arr.add(52f);
		Arr.add(45.2f);
		Arr.add(75.14f);
		
		Vector<String> st = new Vector<>();
		st.add("Rohit");
		st.add("Abhi");
		st.add("Rushi");
		st.add("Dhiraj");
		
		IteratorLinkedll obj1 = new IteratorLinkedll();
		obj1.linkedll(ll);
		obj1.arrayList( Arr);
		obj1.VectorList(st);
		
		
		
		
		
		
		
	}


	
}
