package data_structures;

public class MainStack {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		s1.push("Hi");
		s1.push("from");
		s1.push("Neetha");
		
		System.out.println("peek "+s1.peek());
		
		System.out.println(s1);
		
		s1.pop();
		s1.peek();
		
		System.out.println(s1);

	}

}
