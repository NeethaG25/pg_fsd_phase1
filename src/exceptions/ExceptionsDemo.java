package exceptions;

public class ExceptionsDemo {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int result = 0;
		String s = null;
		
		try {
			
			result = x/y;
			System.out.println("Result  = "+result);
			
			System.out.println(s.length());
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch(NullPointerException e1) {
			System.out.println("Something is Null");
		} finally {
			System.out.println("Result = "+result);
			//System.out.println(args[0]);
		}
		
		System.out.println("Other lines of code");

	}

}
