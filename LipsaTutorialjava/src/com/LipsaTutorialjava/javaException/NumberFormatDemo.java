package com.LipsaTutorialjava.javaException;

public class NumberFormatDemo {
public static void main(String[] args) {
	try{
		String s="xyz";
		int num=Integer.parseInt(s);
		System.out.println(num);
	}catch(NumberFormatException ne){
		System.out.println("Require integer");
	}
}
}
