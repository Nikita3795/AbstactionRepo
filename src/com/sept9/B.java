package com.sept9;

public class B implements A {

	@Override
	public int m1() {
		
		return 1;
	}

	@Override
	public String m2() {
		 
		return "TKA";
	}

	@Override
	public Student m3() {
		Student s1 =  new Student(); 
		return s1;
	}

}
