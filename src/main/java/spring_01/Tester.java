package spring_01;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ApplicationContext  conatiner = new AnnotationConfigApplicationContext(Configuration.class);
		
		System.out.println(conatiner.getBean("car"));
		conatiner.getBean(Car.class).drive();
		
		System.out.println(conatiner.getBean("driver"));
		
		
		conatiner.getBean(Spring_onemore.Driver.class).driverName();
//		conatiner.getBean(Driver.class).driverName()
		
	}



}
