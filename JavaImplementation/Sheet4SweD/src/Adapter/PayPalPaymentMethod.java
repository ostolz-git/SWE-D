/**
 * @(#) PayPalPaymentMethod.java
 */

package Adapter;

public class PayPalPaymentMethod extends PaymentMethod
{	
	final static String methodName = "PAYPAL";
	private String email;

	public PayPalPaymentMethod(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getMethodName() {
		return methodName;
	}		
}