package payment.com;

import org.springframework.stereotype.Component;

@Component
public class BankTransfer implements PaymentMode {

	@Override
	public void payment(int amount) {
		System.out.println("Payment of " + amount + " made through Bank Transfer.");
		
		
	}

}
