/**
 * @(#) CreditCardPaymentMethod.java
 */

package Adapter;

import java.util.Date;

public class CreditCardPaymentMethod extends PaymentMethod
{
	
	

	public CreditCardPaymentMethod(String owner, String number, Date validUntil, String cvv) {
		super();
		this.owner = owner;
		this.number = number;
		this.validUntil = validUntil;
		this.cvv = cvv;
	}

	final static String methodName = "CREDITCARD";
	
	private String owner;
	
	private String number;
	
	private Date validUntil;
	
	private String cvv;

	@Override
	public String getMethodName() {
		return methodName;
	}
	
	
	
	
}
