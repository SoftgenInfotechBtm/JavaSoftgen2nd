package com.mahesh.overriding;

class ABC {
	public void mymethod() {
		System.out.println("Class ABC: mymethod()");
	}
}

class SuperKeyword extends ABC {
	public void mymethod() {
		// This will call the mymethod() of parent class
		super.mymethod();
		System.out.println("Class Test: mymethod()");
	}

	public static void main(String args[]) {
		SuperKeyword obj = new SuperKeyword();
		obj.mymethod();
	}
}