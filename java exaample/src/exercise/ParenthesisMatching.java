package exercise;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisMatching {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		/* Creating Stack */
		Stack<Integer> stk = new Stack<Integer>();
		System.out.println("Parenthesis Matching Test\n");
		/* Accepting expression */
		System.out.println("Enter expression");
		String exp = scan.next();
		int len = exp.length();
		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);
			else if (ch == ')') {
				try {
					int p = stk.pop() + 1;
					System.out.println("')' at index " + (i + 1) + " matched with ')' at index " + p);
				} catch (Exception e) {
					System.out.println("')' at index " + (i + 1) + " is unmatched");
				}
			}
		}
		while (!stk.isEmpty())
			System.out.println("'(' at index " + (stk.pop() + 1) + " is unmatched");
	}
}
