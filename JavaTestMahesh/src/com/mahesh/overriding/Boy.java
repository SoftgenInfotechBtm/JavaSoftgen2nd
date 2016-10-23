package com.mahesh.overriding;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}

	public void walk() {
		System.out.println("Human is walking");
	}

	public void jog() {
		System.out.println("Human is jogging");
	}
}

class Boy extends Human {
	public void eat() {
		System.out.println("Boy is eating");
	}

	public void run() {
		System.out.println("Boy is runing");
	}

	public void racing() {
		System.out.println("Boy is racing");
	}

	public void jog() {
		System.out.println("Boy is jogging");
	}

	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
		obj.run();
		obj.walk();
		obj.jog();

	}
}