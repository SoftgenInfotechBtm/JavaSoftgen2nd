package com.mahesh.stringHandelling;

public class StringConversion {
	public static void main(String[] args) {
		String convertTye = "123123";
		int convInt = Integer.parseInt(convertTye);
		System.out.println("Integer is " + convInt);

		float convInt1 = Float.parseFloat("321");
		System.out.println("Float is " + convInt1);

		double convInt2 = Double.parseDouble("23.32");
		System.out.println("Double is " + convInt2);

		boolean convInt3 = Boolean.parseBoolean("true");
		System.out.println("Boolean is " + convInt3);

		long convInt4 = Long.parseLong("32321312");
		System.out.println("Long is " + convInt4);

		short convInt5 = Short.parseShort("756");
		System.out.println("Short is " + convInt5);

		int asd = 5 > 10 ? 5 : 10;
		System.out.println(asd);
		
		int add =32131;
		float sun = 21.23f;
		System.out.println("String Int is "  + String.valueOf(add));
		System.out.println("String float is "  + String.valueOf(sun));
		
	}
}
