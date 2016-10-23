//Use of Arrayindexoutofbound exception

package com.LipsaTutorialjava.javaException;

public class ArayIndexOOBException {
public static void main(String[] args) {
	try{
		int num[]={1,2,3};
		System.out.println(num[5]);
	}catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Array index out of bound");
	}
	
	
}

}
