package threads;

public class Printer {
	
	public synchronized static void printPages(PrintPageDemo page) {
		System.out.println(page.getPage1());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(page.getPage2());
	}

}
