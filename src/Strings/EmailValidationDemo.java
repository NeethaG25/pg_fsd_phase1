package Strings;


public class EmailValidationDemo {

	public static void main(String[] args) {
		
		String emailAddr = "abc@abc@xyz.com";
		EmailValidation email = new EmailValidation();
		
		email.validate(emailAddr);
	}

}
