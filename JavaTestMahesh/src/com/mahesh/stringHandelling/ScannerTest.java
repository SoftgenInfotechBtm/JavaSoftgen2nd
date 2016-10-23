package com.mahesh.stringHandelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your rollno");
		int rollno = 0;
		try {
			rollno = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input");
			System.out.println("Enter your rollno");
			rollno = sc.nextInt();
		}
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		System.out
				.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
		sc.close();
	}
}
