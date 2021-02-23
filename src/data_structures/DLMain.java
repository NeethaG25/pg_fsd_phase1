package data_structures;

public class DLMain {

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insert(100);
		dl.insert(800);
		dl.insert(900);
		dl.insert(200);
		dl.insert(100);
		dl.insert(1600);
		
		dl.printDoublyLinkedList();

	}

}
