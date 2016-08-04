package exercise;

public class Swaping {

	public static void main(String[] args) {

		int number1 = 20;
		int number2 = 30;

		System.out.println("Before Swapping");
		System.out.println("Value of number1 is :" + number1);
		System.out.println("Value of number2 is :" + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("After Swapping");
		System.out.println("Value of number1 is :" + number1);
		System.out.println("Value of number2 is :" + number2);

	}

}
