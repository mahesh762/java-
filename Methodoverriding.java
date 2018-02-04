package com.mypackage;

public class Methodoverriding {
	
	public static void main(String[] args) {
		Kumar obj = new Kumar();
		obj.Mmk();
		
	}
	void Mmk(){
		System.out.println("inside mmk");
	}
	
	
	
}
class Kumar extends Methodoverriding {
	void Mmk(){
		System.out.println("inside Kumar mmk");    // method override
	}
	
	
	void Kmk(){
	
	System.out.println("inside kumar");
	}
}




 		

