package com.mahesh.methods;

public class ForLoop {
	public static void main(String[] args) {
		String[] args1 = { "abc", "def", "fdfds", "fds" };
		int[] args2 = { 1, 2, 3, 4, 4, 5, 5 };
		for (int intNos : args2) {
			System.out.println(intNos);
		}
		for (int i = 0; i < args1.length; i++) {
			System.out.println(args1[i]);
		}
	}
}
