package com.mahesh.overriding;

class MyBaseClass {
	public void dispq() {
		System.out.println("Parent class method");
	}
	public static void main(String[] args) {
		System.out.println("Hello method");
	}
}

class MyChildClass extends MyBaseClass {
	public void dispq() {
		System.out.println("Child class method");
	}

	public static void main(String args[]) {
		MyBaseClass obj = new MyChildClass();
		obj.dispq();
	}
}