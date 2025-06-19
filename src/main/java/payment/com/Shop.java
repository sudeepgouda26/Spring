package payment.com;


import org.springframework.stereotype.Component;

@Component
public class Shop {
	static void doPayment(PaymentMode pay, int x ) {
		
		
		
		pay.payment(x);
		
		try {
			Thread.sleep( 3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("payment of rs " + x + " done successfully through " + pay.getClass().getSimpleName() + ".\n");
		
		
		
		
	}

}
