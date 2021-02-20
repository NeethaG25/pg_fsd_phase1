package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BusinessLogic {
	
	
	public void openFile(String filename) throws FileNotFoundException, Exception {
		FileInputStream fis = new FileInputStream(filename);
	}
	
	public boolean isValidAge(int age) {
		
		if(age<=0) {
			throw new RuntimeException("Age cannot be -ve or zero");
		}
		
		return true;
	}

}
