package com.sept9;

public class Test {
	public static void main(String [] args) {
		
		
		// interface (we cannot create object of interface)
		//A a1 = new A();
		B b1 = new B();
		System.out.println(b1.m1());
		System.out.println(b1.m2());
		System.out.println(b1.d);
		//b1.d = 89;
		 
		A obji = new B();
		
	}

}
