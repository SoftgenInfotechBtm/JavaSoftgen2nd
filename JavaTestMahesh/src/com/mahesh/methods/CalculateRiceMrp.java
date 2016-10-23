package com.mahesh.methods;

public class CalculateRiceMrp {
	public static void main(String[] args) {
		CalculateRiceMrp obj = new CalculateRiceMrp();
		float mrp = obj.getMrp("Rice");
		float discount = obj.getDiscount("Rice");
		System.out.println("Total Price After Discount " + (mrp-((mrp*discount)/100)));
	}

	float getDiscount(String string) {
		float discount = 0.0f;
		switch (string) {
		case "Rice":
			discount = 5.4f;
			break;
		case "Ragi":
			discount = 9f;
			break;

		default:
			break;
		}
		return discount;
	}
	
	float getMrp(String string) {
		float discount = 0.0f;
		switch (string) {
		case "Rice":
			discount = 50;
			break;
		case "Ragi":
			discount = 965;
			break;

		default:
			break;
		}
		return discount;
	}
}
