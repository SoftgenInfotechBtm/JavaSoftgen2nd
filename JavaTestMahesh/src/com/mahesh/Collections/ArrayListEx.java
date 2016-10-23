package com.mahesh.Collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String args[]) {
		/*
		 * Creation of ArrayList: I'm going to add Stringelements so I made it
		 * of string type
		 */
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + obj);

		obj.add(0, "Rahul");
		obj.add(4, "Justin");
		System.out.println("Current Index Add array list is:" + obj);
		/* Add element at the given index */
		obj.add("Rahul");
		obj.set(2, "Tom");
		obj.add("Justin");
		System.out.println("Current ADDD array list is:" + obj);
		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");
		int pos = obj.indexOf("Rahul");
		String str = obj.get(2);
		int numberofitems = obj.size();
		System.out.println("Current array list position stringvalue size is:" + "\n" + obj + "\n" + pos + "\n" + str
				+ "\n" + numberofitems);
		boolean adc = obj.contains("Steve");
		System.out.println("Current bool array list is:" + adc);

		/* Remove element from the given index */
		obj.remove(1);
		obj.clear();
		System.out.println("Current array list is:" + obj);
		ArrayList<Integer> fds = new ArrayList<>();
	}
}
