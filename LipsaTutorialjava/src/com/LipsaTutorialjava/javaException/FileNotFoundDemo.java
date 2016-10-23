package com.LipsaTutorialjava.javaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileNotFoundDemo {
public static void main(String[] args) {
	File f=new File("E://file.txt");
	try {
		FileReader fr=new FileReader(f);
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
