/**
 * @(#) PayPalAdapter.java
 */

package Adapter;

/**
 * This class represents the information needed for a PayPal payment. Its purpose is to provide customers with a PayPal payment method.
 */
public class PayPalAdapter implements PaymentServiceInterface
{
	private PayPalService service = new PayPalService();

	@Override
	public String makePayment(double amount, PaymentMethod paymentMethod) {
		
		PayPalPaymentMethod payPal = (PayPalPaymentMethod) paymentMethod;
		return service.makePayment(amount,payPal.getEmail());
		
	}
	
	
}
