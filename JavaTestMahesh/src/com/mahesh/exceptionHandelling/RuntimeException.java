package com.mahesh.exceptionHandelling;

public class RuntimeException {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 0;
		/*
		 * Since I'm dividing an integer with 0 it should throw
		 * ArithmeticException
		 */
		try {
			int res1 = num1 / num2;
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
		try {
			int res = num1 / num2;
			System.out.println(res);
			int mod = num1 % num2;
			System.out.println(mod);
		} catch (ArithmeticException e) {
			System.out.println("Do Properly");
			e.printStackTrace();
		}
	}
}
