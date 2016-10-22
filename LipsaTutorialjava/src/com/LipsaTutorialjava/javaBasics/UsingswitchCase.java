/*WAP to print colour as per user choice using switch case */
package com.LipsaTutorialjava.javaBasics;
import java.io.*;
public class UsingswitchCase {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the choice either 1,2 or 3");
	char ch=(char) br.read();
	switch(ch){
	case '1':
		System.out.println("yellow");
		break;
	case '2':
		System.out.println("Red");
		break;
	case '3':
		System.out.println("Green");
		break;
	default:
		System.out.println("Not a valid choice");
			
	}
}

}
