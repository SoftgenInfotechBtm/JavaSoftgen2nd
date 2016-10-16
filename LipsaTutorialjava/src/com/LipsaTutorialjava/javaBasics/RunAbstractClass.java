package com.LipsaTutorialjava.javaBasics;

public class RunAbstractClass extends AbstractClassImplement{
	public static void main(String[] args) {
		RunAbstractClass r=new RunAbstractClass();
		r.colorDisp();
		r.start();
		r.stop();
	}

	void start() {
System.out.println("car is start");		
	}

	void stop() {
System.out.println("car is stop");		
	}
}
