package com.mahesh.inheritance;

public class Emp {
	int id;
	String name;
	Addre Addre;

	public Emp(int id, String name, Addre Addre) {
		this.id = id;
		this.name = name;
		this.Addre = Addre;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(Addre.city + " " + Addre.state + " " + Addre.country);
	}

	public static void main(String[] args) {
		Addre Addre1 = new Addre("gzb", "UP", "india");
		Addre Addre2 = new Addre("gno", "UP", "india");

		Emp e = new Emp(111, "varun", Addre1);
		Emp e2 = new Emp(112, "arun", Addre2);

		e.display();
		e2.display();

	}
}