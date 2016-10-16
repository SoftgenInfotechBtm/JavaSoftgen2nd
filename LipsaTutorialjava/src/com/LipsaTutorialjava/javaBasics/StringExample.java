package com.LipsaTutorialjava.javaBasics;

import java.io.*;

public class StringExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:: ");
		String s = br.readLine();
		System.out.println(s);
		StringExample.stringLength(s);
		StringExample st=new StringExample();
		st.stringConcat();
		StringExample.stringFormat();
		st.stringCharAt();
		st.stringCompareToMethod();
		st.stringHashcode();
	}

	public static void stringLength(String s1) {
		System.out.println("Length of given String is " + s1.length());
	}
	public void stringConcat(){
		String s1="welcome";
		String s2="String";
		System.out.println("Concating two strings by method :: " + s1.concat(s2));
		System.out.println("Concating two strings by operator:: " + (s1+s2));
	}
	public static void stringFormat(){
		String s="Hello";
		System.out.print("String in format "+" %s "+ s);
	}
	public void stringCharAt(){
		String s="Welcome to String";
		char a=s.charAt(2);
		System.out.println("Character at second position is :: " + a);
	}
	public void stringCompareToMethod(){
		String s1="String is immutable";
		String s2=new String("Strings are immutable");
		String s3=new String("Integers are not immutable");
		int result=s1.compareTo(s2);
		System.out.println("Comparing between two strings :: " + result);
		result=s2.compareTo(s3);
		System.out.println("comparing between 2nd and 3rd string :: " + result);
	}
	public void stringHashcode(){
		String s1="Hello";
		int hs=s1.hashCode();
		System.out.println("Hashcode of string is :: "+ hs);
	}

}
