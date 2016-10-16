package com.LipsaTutorialjava.javaBasics;

interface InterfaceExample {
	public void start();

	public void stop();

}

class ImplementInterface implements InterfaceExample {
	public static void main(String[] args) {
		ImplementInterface i = new ImplementInterface();
		i.start();
		i.stop();
	}

	public void start() {
		System.out.println("start");
	}

	public void stop() {
		System.out.println("stop");
	}

}
