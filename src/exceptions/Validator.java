package exceptions;

public class Validator {
	
	public boolean isVslidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
		
		if(mobileNumber == null || mobileNumber.equals("")) {
			throw new InvalidMobileNumberException("Mobile Number cannot be empty");
		}
		return true;
		
	}

}
