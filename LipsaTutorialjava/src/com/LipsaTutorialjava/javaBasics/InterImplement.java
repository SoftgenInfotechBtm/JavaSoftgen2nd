package com.LipsaTutorialjava.javaBasics;

public class InterImplement extends AbstractClassImplement implements Test1,
		Test2, Test3 {
	public static void main(String[] args) {
		InterImplement i = new InterImplement();
		i.add();
		i.colorDisp();
		i.mul();
		i.sub();

	}

	public void mul() {
		System.out.println("in Multiplication");
	}

	public void add() {
		System.out.println("add");
	}

	public void sub() {
		System.out.println("sub");
	}

	void start() {
		System.out.println("start");
	}

	void stop() {
		System.out.println("stop");
	}

}
