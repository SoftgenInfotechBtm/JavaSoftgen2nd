package com.mahesh.abstraction;

public abstract class Confsed {
	public void myConfsed() {
		System.out.println("Confsed");
	}

	public abstract int anotherConfsedMethod(int a);
	public abstract int anotherConfsedMethod(float a);
	public void anotherConfsedMethod() {
		System.out.print("Inside Confsed method");
	}
}
