/**
 * @(#) PaymentHandler.java
 */

package Adapter;

/**
 * Used to interface with an external payment service provider. Primarily offers
 * an operation to get the payment status for a given payment ID.
 */
public class PaymentHandler {
	public String getPaymentStatus(String paymentId) {
		return "SUCCESS";
	}

	public String makePayment(double amount, PaymentMethod paymentMethod) {

		String method = paymentMethod.getMethodName();
		PaymentServiceInterface paymentService = getAdapter(method);
		return paymentService.makePayment(amount, paymentMethod);
	}

	private PaymentServiceInterface getAdapter(String paymentMethod) {

		switch (paymentMethod) {

		case PayPalPaymentMethod.methodName:

			return new PayPalAdapter();

		case DebitCardPaymentMethod.methodName:

			return new DebitCardAdapter();

		case CreditCardPaymentMethod.methodName:
			return new CreditCardAdapter();

		}
		return null;
	}
}