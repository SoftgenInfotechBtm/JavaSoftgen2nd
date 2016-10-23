package com.mahesh.methods;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicInputs {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		System.out.println(s+i);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	DataInputStream dis = new DataInputStream(System.in);
	try {
		int i = dis.readInt();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	Console console = System.console();
	String s = console.readLine();
	int i = Integer.parseInt(console.readLine());
	
	Scanner scan = new Scanner(System.in);
	String ss = scan.next();
	int ii = scan.nextInt();
}
}
