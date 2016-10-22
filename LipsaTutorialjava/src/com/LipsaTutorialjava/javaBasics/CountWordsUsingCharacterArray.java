//WAP to count the words using character array 
package com.LipsaTutorialjava.javaBasics;

import java.io.*;
import java.util.*;

public class CountWordsUsingCharacterArray {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=1;
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)== ' ') && (s.charAt(i+1) != ' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in string " + count);
		sc.close();
	}
}
