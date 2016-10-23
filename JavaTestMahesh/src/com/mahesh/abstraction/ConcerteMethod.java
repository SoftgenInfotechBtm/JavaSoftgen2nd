package com.mahesh.abstraction;

abstract class AbstractDemo {
	public void myMethod() {
		System.out.println("Hello");
	}

	public abstract int anotherMethod(int a);
	public abstract void testAnotherMethod(int a);
	public void anotherMethod() {
		System.out.print("Inside Abstract method");
	}
}

abstract class AbstractDemo1 extends AbstractDemo {
	public void myMethod() {
		System.out.println("Hello");
	}

	public abstract int anotherMethod(int a);
	public abstract void testAnotherMethod(int a);
	public void anotherMethod() {
		System.out.print("Inside Abstract method");
	}
}

public class ConcerteMethod extends AbstractDemo1{
	public void anotherMethod() {
		System.out.print("Abstract method");
	}

	public static void main(String args[]) {
		AbstractDemo obj = new ConcerteMethod();
		obj.anotherMethod();
		int dsa = obj.anotherMethod(32);
		System.out.print("Abstract method" + dsa);
		obj.myMethod();
	}


	@Override
	public void testAnotherMethod(int a) {
		System.out.print("inside testAnotherMethod");		
	}

	@Override
	public int anotherMethod(int a) {
		System.out.print("inside Auto-generated method stub");
		return a;
	}

}