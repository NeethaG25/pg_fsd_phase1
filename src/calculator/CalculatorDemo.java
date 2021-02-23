package calculator;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = -1;
		MathOperations calc = new MathOperations();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please select one of the below options to perform Arithmatic Operations");
		System.out.println("Option 1: Add");
		System.out.println("Option 1: Subtract");
		System.out.println("Option 1: Multiply");
		System.out.println("Option 1: Divide");
		System.out.println("Your Selection:");
		int choice = in.nextInt();
		
		switch(choice) {
		case 1:
			calc.add(a, b);
			break;
		case 2:
			calc.subtract(a, b);
			break;
		case 3:
			calc.multiply(a, b);
			break;
		case 4:
			calc.divide(a, b);
			break;
		default:
			System.out.println("Incorrect Choice!");
		}
		
		in.close();

	}

}
