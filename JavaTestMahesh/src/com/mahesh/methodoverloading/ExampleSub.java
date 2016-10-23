package com.mahesh.methodoverloading;

public class ExampleSub {
	public static void main(String[] args) {
		ExampleSub obj = new ExampleSub();
		
		obj.sub(12);
		obj.sub(23.33f);

		obj.sub(43, 23.33f);
		obj.sub(322, 32, 23);

		obj.sub(12, 22.332);
		obj.sub(323.32, 21);
	}

	private void sub(double d, int d2) {
		System.out.println("Sequence Is " + d + d2);
	}

	private void sub(int i, double d) {
		System.out.println("Sequence Is " + i + d);
	}

	private void sub(int i, int j, int k) {
		System.out.println("No of params " + i + j + k);
	}

	private void sub(int i, float f) {
		System.out.println("No of params " + i + f);
	}

	private void sub(float f) {
		System.out.println("Datatypes " + f);
	}

	private void sub(int i) {
		System.out.println("Datatypes " + i);
	}
}
