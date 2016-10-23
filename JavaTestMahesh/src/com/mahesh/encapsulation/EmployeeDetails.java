package com.mahesh.encapsulation;

public class EmployeeDetails {
	// static {
	// System.out.println("empNme : " + "first");
	// }

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.empAddress = "BTM";
		obj.empAge = 32;
		obj.empBatch = 32522;
		obj.empGender = "Male";
		obj.empId = 5;
		obj.empNme = "Softgen";
		obj.empSalary = 59324;
		obj.EmployeeAttributes();
		// EmployeeDetails obdd = new EmployeeDetails();
		// obdd.setert();
		// sett();
		// String[] abs = {"hello",""};
		// ClassName.main(abs);
	}

	static {
		System.out.println("empNme : " + "jgfhj");
	}

	static class ClassName {
		public static void main(String[] args) {
			System.out.println("empNme : " + "clsss");
		}
	}

	public static void sett() {
		System.out.println("empNme : " + "method");
	}

	public void setert() {
		System.out.println("empNme : " + "desert method");
	}
}
