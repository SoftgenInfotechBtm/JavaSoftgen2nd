package com.mahesh.blocks;

class Finalize {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		f1 = null;
		f2 = null;
		System.gc();
	}
}