/**
 * @(#) PaymentServiceInterface.java
 */

package Adapter;

public interface PaymentServiceInterface
{
	String makePayment( double amount, PaymentMethod paymentMethod );
	
	
}
