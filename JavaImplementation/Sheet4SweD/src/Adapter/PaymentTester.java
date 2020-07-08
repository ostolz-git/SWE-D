/**
 * @(#) PaymentTester.java
 */

package Adapter;

public class PaymentTester
{
	public void testPayPalPayment( )
	{
		System.out.println("##########Testing PayPal payment##########");
		
		
		PaymentHandler paymentHandler = new PaymentHandler();

		
		//Assume, rent ends and payment process starts
		
		double amount = 5.78;
		String email = "test@example.com";
		PaymentMethod paymentMethod = new PayPalPaymentMethod(email);
		String result = paymentHandler.makePayment(amount, paymentMethod);
		
		//Assertion: result should be SUCCESS 
		System.out.println("result:" + result);
	}
	
	
}
