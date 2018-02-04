package com.mypackage;

public class Operator {
 
		 public static void main(String args[]){  
		   String s1="Mahesh";  
		   String s2="Mahesh";  
		   String s3=new String("Mahesh");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		 }  
		}  
	
	
	


