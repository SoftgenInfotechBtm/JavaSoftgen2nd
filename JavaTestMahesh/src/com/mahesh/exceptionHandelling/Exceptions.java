package com.mahesh.exceptionHandelling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Exceptions {
	public static void main(String args[]) throws IOException {
		String content = "This is the content to write into file";
		FileInputStream fis = null;
		int k;
		fis = new FileInputStream("C:/Softgen/mahesh.txt");
		File file = new File("C:/Softgen/mahesh.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		System.out.println("Done");
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();
		
	}
}
