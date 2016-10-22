//WAP to count the no.of words in a string
package com.LipsaTutorialjava.javaBasics;

import java.io.*;
import java.util.*;

public class CountTheWords {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s = sc.nextLine();
		String[] words = s.trim().split(" ");
		System.out.println("Number of words in a string " + words.length);
		sc.close();
	}
}
