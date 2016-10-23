package com.mahesh.staticmethods;

public class VariableDemo {
	 int count = 0;

	public void increment() {
		count++;
	}
	static{
		System.out.println("HEllo");
	}

	public static void main(String args[]) {
		VariableDemo obj1 = new VariableDemo();
		VariableDemo obj2 = new VariableDemo();
		obj1.increment();
		System.out.println("Obj1: count is=" + obj1.count);
		obj2.increment();
		System.out.println("Obj2: count is=" + obj2.count);
	}
}
