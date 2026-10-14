//Bank Payment
package interfacepack;

interface PaymentMethod {
	void checkout(double amount, String paymentAPI);
}

class GooglePay implements PaymentMethod {
	public void checkout(double amount, String paymentAPI) {
		System.out.println("Paid Rs." + amount + "  using Google Pay: " + paymentAPI);
	}
}

class CreditCard implements PaymentMethod {
	public void checkout(double amount, String paymentAPI) {
		System.out.println("Paid Rs." + amount + "  using Credit Card: " + paymentAPI);
	}
}

class PhonePe implements PaymentMethod {

	public void checkout(double amount, String paymentAPI) {
		System.out.println("Paid Rs." + amount + "  using PhonePe: " + paymentAPI);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		PaymentMethod creditCard = new CreditCard();
		creditCard.checkout(5000.0, "credit-card-number,user-name,expiry-date,cvv");
		
		PaymentMethod gpay = new GooglePay();
		gpay.checkout(4500.0, " gpay-mobile-no,bank-name,pin");
		
		PaymentMethod phonePe = new PhonePe();
		phonePe.checkout(2700.0, "phone-pe-mobile-no,bank-name,transaction-pin");
	}

}
