package payment.com;

import java.io.IOException;
import java.nio.CharBuffer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpiPayment implements PaymentMode{

	@Override
	public void payment(int amount) {
		System.out.println("Payment of " + amount + " made through UPI.");
		
	}

	

}
