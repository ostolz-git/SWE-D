/**
 * @(#) PaymentMethod.java
 */

package Adapter;

/**
 * This class is an abstract payment method representation. Its purpose is to be concretised by the specific payment methods our escooter service offers.
 */
public abstract class PaymentMethod
{
	
	
	abstract public String getMethodName();
}
