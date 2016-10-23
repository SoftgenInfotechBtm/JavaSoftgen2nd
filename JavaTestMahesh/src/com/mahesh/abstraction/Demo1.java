package com.mahesh.abstraction;
abstract class Demo2 {
	public void disp1() {
		System.out.println("Concrete method of abstract class");
	}

	abstract public void disp2();
}

class Demo1 extends Demo2{
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.disp1();
//		obj.disp2();
	}
	public void disp1() {
		System.out.println("Concrete method of main class");
	}
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("dasd");
	}
}