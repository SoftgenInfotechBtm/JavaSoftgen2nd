package com.mahesh.stringHandelling;

public class StartsWith {
	public static void main(String[] args) {
		String str = "softgen";
		System.out.println(str.startsWith("gen",2));
		System.out.println(str.startsWith("sof"));
		
		System.out.println(str.endsWith("gen"));
	}
}
