package data_structures;

import data_structures.LinkedList.Node;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	class Node {
		int data;
		Node next;
		Node previous;
		public Node (int data) {
			this.data = data;
		}
	}
	
	public void insert (int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		} else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
			
		}
	}
	
	public void printDoublyLinkedList() {
		
		Node cuNode = head;
		while(cuNode!=null) {
			System.out.println(cuNode.data);
			cuNode=cuNode.next;
			
		}
	}
	

}
