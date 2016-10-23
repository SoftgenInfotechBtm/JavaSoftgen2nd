package com.mahesh.overriding;

class Animals {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog1 extends Animals {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class TestDog1 {

	public static void main(String args[]) {
		Animals a = new Animals(); // Animal reference and object
		Animals b = new Dog1(); // Animal reference but Dog object

		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog class
	}
}