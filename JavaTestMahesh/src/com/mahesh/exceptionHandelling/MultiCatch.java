package com.mahesh.exceptionHandelling;

public class MultiCatch {
	public static void main(String args[]) {
		try {
			int a[] = new int[7];
			a[4] = 30 / 10;
			String dfs = null;
			if (dfs != null)
				dfs.substring(23);
			System.out.println("First print statement in try block");
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
			e.printStackTrace();
		}
		System.out.println("Out of try-catch block...");
	}
}
