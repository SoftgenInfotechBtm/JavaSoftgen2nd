package com.LipsaTutorialjava.javaBasics;

public class Returntype {

	public static void main(String[] args) {
		Returntype r = new Returntype();
		System.out.println("sum= " + r.addition(7, 8));
		System.out.println("sub= " + Returntype.substraction());
		System.out.println("div=" + r.division());
		System.out.println("chek= " + Returntype.check());
		System.out.println("mul=" + r.multiplication(5,6));
		float cba = Returntype.sub(7.2f, 88.000812f);
		System.out.println("Substraction= " +cba);
		
	}

	private static int sub(float f, float g) {
		return (int) (f - g);
	}

	private float multiplication(float f, float g) {
		return f * g;
	}

	public int addition(int a, int b) {
		return (a + b);
	}

	public float multiplication() {
		float a = 2.0f, b = 3.0f;
		return (a * b);
	}

	public static int substraction() {
		int a = 7, b = 4;
		int sub = a - b;
		return sub;
	}

	public float division() {
		float a = 6, b = 2;
		return (a / b);
	}

	public static boolean check() {
		int a = 6, b = 5;
		if (a > b)
			return true;
		else
			return false;

	}
}
