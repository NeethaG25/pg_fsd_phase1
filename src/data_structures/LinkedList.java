package data_structures;

public class LinkedList {
	
	class Node {
		int data;
		Node next;
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public LinkedList insert(LinkedList list, int data) {
		Node node = new Node(data);
		if(list.head==null) {
			list.head = node;
		} else {
			Node findLast = list.head;
			while(findLast.next!=null) {
				findLast = findLast.next;
			}
			findLast.next =  node;
		}
		return list;
	}
	
	public void printList(LinkedList list) {
		System.out.println(("Contents of the Linked List is"));
		Node findLast = list.head;
		while(findLast!=null) {
			System.out.println(findLast.data);
			findLast = findLast.next;
		}
	}

}
