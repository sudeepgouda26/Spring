package payment.com;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ApplicationContext container =  new AnnotationConfigApplicationContext(Configuration.class);
		 System.out.println("Enter the amount to be paid: " );
		 int x = sc.nextInt();
		  
	 UpiPayment first = container.getBean(UpiPayment.class);
	 BankTransfer second = container.getBean(BankTransfer.class);
		 
		 container.getBean(BankTransfer.class);
		 container.getBean(Shop.class).doPayment(first, x);
		 container.getBean(Shop.class).doPayment(second, x);

	}

}
