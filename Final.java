package com.mypackage;
class Variable{
	
	final int a = 10; //final variable
	void m1() {
		a = 12; // i am trying to change final variable but it can.t be changed.because, once you assigned final variable a value can be never changed
		
	}
	
	public static void main(String[] args) {
		Variable obj= new Variable ();
		obj.m1();
		
	}
}



// if you make any method as a final you can't override it.
// if you make any class you can't extended it.