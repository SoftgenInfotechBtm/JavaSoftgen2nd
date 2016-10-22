//WAP to count the tokens or words using StringTokenizer
package com.LipsaTutorialjava.javaBasics;

import java.io.*;
import java.util.StringTokenizer;
public class CountTokenUsingStringTokenizer {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a string for counting ");
	String s=br.readLine();
	StringTokenizer st=new StringTokenizer(s);
	while(st.hasMoreElements())
	{
		System.out.println("count tokens or words " + st.countTokens());
		System.out.println("token is " + st.nextToken());
	}
}
}
