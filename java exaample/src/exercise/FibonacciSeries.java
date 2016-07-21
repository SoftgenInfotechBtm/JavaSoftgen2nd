package exercise;

public class FibonacciSeries {
	public static void main(String[] args) {

		int prev, next, sum, n;

		prev = next = 1;

		for (n = 0; n < 10; n++) {
			System.out.println("FibonacciSeries.main()" + prev);
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}

}
