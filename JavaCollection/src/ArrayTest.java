import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList <>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		
		ArrayTest obj = new ArrayTest();
		obj.iterateArray(al);
		obj.iterateUsingForLoop(al);
		
	}
	
	void r1() {
		
		
	}
	
	
	void iterateArray (ArrayList<Integer> al) {
		
		Iterator<Integer> itrr = al.iterator();
		
		while(itrr.hasNext()) {
			
			int val = itrr.next();
			System.out.println("the array element " +val);
		}
	}
	
	void iterateUsingForLoop(ArrayList<Integer> al) {
		
		for (Integer val : al ) {
			
			System.out.println(val);
		}
	}
}
