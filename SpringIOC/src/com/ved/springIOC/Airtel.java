package com.ved.springIOC;

public class Airtel implements Sim{

	 
	
	@Override
	public void calling() {
		System.out.println("calling with Airtel!!");
		
	}

	@Override
	public void data() {
		System.out.println("using Airtel data");
		
	}
	
 
}
