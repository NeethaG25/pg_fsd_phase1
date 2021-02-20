package threads;

public class PrintPageDemo implements Runnable{
	private String page1;
	private String page2;
	
		
	public PrintPageDemo(String page1, String page2) {
		System.out.println("Inside constructor");
		this.page1 = page1;
		this.page2 = page2;
		Thread t = new Thread(this);
		t.start();
		
	}
	
	public String getPage1() {
		return page1;
	}
	public void setPage1(String page1) {
		this.page1 = page1;
	}
	public String getPage2() {
		return page2;
	}
	public void setPage2(String page2) {
		this.page2 = page2;
	}

	@Override
	public void run() {
		System.out.println("Inside run");
		//PrintPageDemo page = new PrintPageDemo(page1,page2);
		Printer.printPages(this);
		
	}
	
	

}
