package data_structures;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList ();
		l1.insert(l1, 100);
		l1.insert(l1, 200);
		l1.insert(l1, 300);
		l1.insert(l1, 1600);
		l1.insert(l1, 900);
		
		l1.printList(l1);

	}

}
