package exceptions;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		BusinessLogic b =new BusinessLogic();
		try {
			b.openFile("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println("This file is not found");
		} catch (Exception e ) {
			e.printStackTrace();
		}
		try {
			if(b.isValidAge(1)) {
				System.out.println("Age Validated");
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
		}

	}

}
