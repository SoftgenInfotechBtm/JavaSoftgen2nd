package com.mahesh.interfaces;

interface MyInterface {
	abstract void method1();
	void method2();
}

interface MyInterface1 extends MyInterface{
	public void method1();

	public void method4();
}

class Interf implements MyInterface,MyInterface1 {

	public static void main(String arg[]) {
		System.out.println("inside mainmethod");
		Interf obj = new Interf();
		obj.method1();
		obj.method2();
		obj.method4();
	}

	public void method1() {
		System.out.println("inside method 1");
	}

	public void method2() {
		System.out.println("inside method 2");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub

	}

}