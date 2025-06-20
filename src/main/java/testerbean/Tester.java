package testerbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Tester implements Runnable {

@Autowired	
Apple apple;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		apple.eat();
		
	}

}
