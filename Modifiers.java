package com.mypackage;


public class Modifiers {
	
	private int a =10;
	
	public static void main(String[] args) {
		Modifiers obj = new Modifiers();
		obj.a = 20;                     // private access modifier is  accessible with in the class
		System.out.println(obj.a);
		
		
	}

}


class Default{
	
	// com.mypackage
	//save by instancevariableDemo
	
	public static void main(String[] args) {
		InstanceVariableDemo obj = new InstanceVariableDemo ();
	System.out.println(obj.a);  // Default modifier access with in the package and if you don't use any modifier it treated as Default by Default
	}
}




	
	
	
