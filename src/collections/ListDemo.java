package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("Hello");
		l1.add(12345);
		l1.add('a');
		l1.add(true);
		l1.add(22.345);
		l1.add(123558763486353576l);
		
		System.out.println("Linked List l1 : "+l1);
		
		List<Integer> l2 = new LinkedList<>();
		l2.add(123);
		l2.add(456);
		l2.add(126);
		l2.add(null);
		l2.add(876);
		System.out.println("L2 : "+l2);
		System.out.println("Size of l2 : "+l2.size());
		l2.add(2,38475);
		System.out.println("Insert : "+l2);
		l2.set(3, 400);
		System.out.println("update : "+l2);
		l2.get(4);
		System.out.println("read : "+l2);
		for(int i=0; i< l2.size(); i++) {
			System.out.println("reading l2 using for : "+l2.get(i));
		}
		Integer obj=null;
		l2.remove(2);
		System.out.println("Delete : "+l2);
		l2.remove(obj);
		System.out.println("remove element : "+l2);
		while( l2.remove(obj)) {}
		System.out.println("remove all occurances : "+l2);
		
		Collections.reverse(l2);
		System.out.println("Reverse collection : "+l2);
		
		Collections.replaceAll(l2, null, 0);
		System.out.println("Replacing null with 0 before sorting : "+l2);
		
		Collections.sort(l2);
		System.out.println("Sorting, default ascending : "+l2);
		
		Collections.sort(l2, Collections.reverseOrder());
		System.out.println("Descending order : "+l2);
		
		Collections.shuffle(l2);
		System.out.println("Shuffle : "+l2);
		
		
	}

}
