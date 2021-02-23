package calculator;

public class MathOperations {
	
	public void add (int a, int b) {
		System.out.println("The sum of a and b = "+(a+b));
	}
	
	public void subtract (int a, int b) {
		System.out.println("The difference between a and b = "+(a-b));
	}
	
	public void multiply (int a, int b) {
		System.out.println("The product of a and b = "+(a*b));
	}
	
	public void divide (int a, int b) {
		int quotient = 0;
		if(b!=0) {
			quotient = (a/b);
			System.out.println("a divided by b = "+quotient);
		}else {
			System.out.println("Division by zero is not allowed");
		}		
	}

}
