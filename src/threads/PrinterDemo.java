package threads;

public class PrinterDemo {

	public static void main(String[] args) {
		System.out.println("Started Main");
		new PrintPageDemo("page1 for user1","page2 for user1");
		new PrintPageDemo("page1 for user2","page2 for user2");
		new PrintPageDemo("page1 for user3","page2 for user3");
		new PrintPageDemo("page1 for user4","page2 for user4");
		new PrintPageDemo("page1 for user5","page2 for user5");
		new PrintPageDemo("page1 for user6","page2 for user6");

	}

}
