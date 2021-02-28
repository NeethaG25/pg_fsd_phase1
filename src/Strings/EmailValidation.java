package Strings;

import java.util.regex.Pattern;

public class EmailValidation {
	
	public void validate(String email) {
		if(Pattern.matches("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})", email)) {
			System.out.println("This is a valid Email Address");
		} else {
			System.out.println("This is not a valid Email Address");
		}
	}

}
