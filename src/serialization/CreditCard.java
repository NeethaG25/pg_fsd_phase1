package serialization;

import java.io.Serializable;

public class CreditCard implements Serializable{
	public CreditCard(Long creditcardname, String creditcardnumber, String cctype, int cvv) {
		super();
		this.creditcardname = creditcardname;
		this.creditcardnumber = creditcardnumber;
		this.cctype = cctype;
		this.cvv = cvv;
	}
	private Long creditcardname;
	private String creditcardnumber;
	private String cctype;
	private transient int cvv;
	
	public Long getCreditcardname() {
		return creditcardname;
	}
	public void setCreditcardname(Long creditcardname) {
		this.creditcardname = creditcardname;
	}
	public String getCreditcardnumber() {
		return creditcardnumber;
	}
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	public String getCctype() {
		return cctype;
	}
	public void setCctype(String cctype) {
		this.cctype = cctype;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [creditcardname=" + creditcardname + ", creditcardnumber=" + creditcardnumber + ", cctype="
				+ cctype + ", cvv=" + cvv + "]";
	}
	
	

}
