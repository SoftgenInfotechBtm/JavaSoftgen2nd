package com.LipsaTutorialjava.javaException;

public class ArithmaticExceptionDemo {
public static void main(String[] args) {
	int n=0;
	try{
		int res=5/n;
		System.out.println(res);
	}catch(ArithmeticException e){
		System.out.println("Number is devided by zero");
	}
			
}
}
