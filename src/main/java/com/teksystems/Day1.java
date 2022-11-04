package com.teksystems;

import java.io.File;

public class Day1 {

	public static void main(String[] args) {
	System.out.println("Operating system slash is " + File.separator);
	
	File macRoot = new File("/");
	File windowsRoot = new File("\\development");
	
	for ( File file : macRoot.listFiles()) {
		System.out.println(file.getAbsolutePath() + " is directory " + file.isDirectory());
	}
	
	System.out.println("====================");
	File desktop = new File("C:/Users/lauren/Desktop/test.txt");
	System.out.println(desktop.getName() + " File exists " + desktop.exists());
	System.out.println(desktop.getAbsolutePath() + " File exists " + desktop.exists());
	
	File temp = new File("./newfile.txt" );
	}	
}
