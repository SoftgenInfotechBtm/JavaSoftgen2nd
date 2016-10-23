package com.mahesh.stringHandelling;

public class Split {
	public static void main(String[] args) {
		String m = new String("i am mahesh");
		String[] count = m.split(" ");
		String.valueOf(m.charAt(2)).equalsIgnoreCase(String.valueOf(m.charAt(2)));
		for (int i = count.length - 1; i >= 0; i--) {
			System.out.print(count[i].toString() + " ");
		}
	}
}