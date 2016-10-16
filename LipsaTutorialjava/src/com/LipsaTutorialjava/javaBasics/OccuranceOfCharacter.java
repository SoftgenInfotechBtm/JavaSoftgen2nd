//WAP to count the number of occurrence of character in a given string 
package com.LipsaTutorialjava.javaBasics;

import java.io.*;
import java.util.*;

public class OccuranceOfCharacter {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = sc.nextLine();
		int count = s.length() - s.replace("a", "").length();
		System.out.println("The number of occurance of a in string is " + s
				+ "=" + count);
		sc.close();
	}
}
