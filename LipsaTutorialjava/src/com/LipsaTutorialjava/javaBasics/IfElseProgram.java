/*WAP to check number is even or odd*/
package com.LipsaTutorialjava.javaBasics;

import java.io.IOException;
import java.util.Scanner;

public class IfElseProgram {
	public static void main(String[] args) throws IOException {
		System.out.println("enter a number to check");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("number is even " + number);
		else
			System.out.println("number is odd " + number);

		sc.close();
	}

}
