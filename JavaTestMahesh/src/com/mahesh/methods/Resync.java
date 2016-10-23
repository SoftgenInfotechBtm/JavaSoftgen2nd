package com.mahesh.methods;

public class Resync {
	public static void main(String[] args) {
		Resync test = new Resync();
		double abd = test.sub(12.32, 34.243);
		System.out.println("value is  " + test.sum(30, 20));
		System.out.println("value is  " + test.sub(12, 34.243f));
		System.out.println("value is  " +( abd + test.sum(30, 20f)));
	}

	private double sub(double d, double e) {
		return d - e;
	}

	private int sum(int i, int j) {
		if (i < j)
			return 0;
		System.out.println("hello");
		return i + j;
	}

	private float sum(int i, float j) {
		return i + j;
	}

	private float sub(int i, float j) {
		return i - j;
	}
}
