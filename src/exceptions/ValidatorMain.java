package exceptions;

public class ValidatorMain {

	public static void main(String[] args) {
		Validator v = new Validator();
		
		try {
			if(v.isVslidMobileNumber("")) {
				System.out.println("Mobile Number is validated");
			}
			
		} catch (InvalidMobileNumberException e) {
				System.out.println(e.getMessage());
		}
		

	}

}
