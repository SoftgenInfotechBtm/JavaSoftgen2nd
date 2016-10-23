package com.mahesh.overriding;

class Amithab {
	public void dialogues() {
		System.out.println("Dialogues method of Amithab class");
	}

	public void acting() {
		System.out.println("Acting() method of Amithab class");
	}
	
	public void music() {
		System.out.println("music() method of Amithab class");
	}
}

class Abhishek extends Amithab {
	public void dialogues() {
		System.out.println("Dialogues() method of Abhishek class");
	}

	public void acting() {
		System.out.println("Acting() method of Abhishek class");
	}
	public void dance() {
		System.out.println("dance() method of Abhishek class");
	}
}

class Aradhya extends Abhishek {
	public void acting() {
		System.out.println("Aradhya method of Acting class");
	}

	public void emotions() {
		System.out.println("Aradhya method of emotions class");
	}
	
	public void baby() {
		System.out.println("Aradhya method of baby class");
	}
	public static void main(String args[]) {
		Abhishek obj = new Aradhya();
		obj.dialogues();
		obj.acting();
		obj.music();
		obj.dance();
//		obj.baby();
//		obj.emotions();
	}
}
