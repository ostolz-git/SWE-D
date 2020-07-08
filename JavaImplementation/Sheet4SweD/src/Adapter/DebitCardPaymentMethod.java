/**
 * @(#) DebitCardPaymentMethod.java
 */

package Adapter;

public class DebitCardPaymentMethod extends PaymentMethod
{
	

	final static String methodName = "DEBITCARD";
	
	public DebitCardPaymentMethod(String owner, String iban) {
		super();
		this.owner = owner;
		this.iban = iban;
	}

	private String owner;
	
	private String iban;

	@Override
	public String getMethodName() {
		
		return methodName;
	}
	
	
}
