/*WAP to print 1 to a limit number using while loop*/
package com.LipsaTutorialjava.javaBasics;

import java.io.*;

public class UsingWhileLoop {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a limit number upto which it print ");
		int limit = br.read();
		int i = 1;
		while (i <= limit) {
			System.out.println(i);
			++i;
		}

	}
}
