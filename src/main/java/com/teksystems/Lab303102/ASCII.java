package com.teksystems.Lab303102;

import java.io.FileInputStream;

public class ASCII {

	public static void main(String[] args) {
		FileInputStream fileInput;
		try {
			fileInput = new FileInputStream("/Users/laurenhammonds/Downloads/file1.txt");
			int r;
			while ((r = fileInput.read()) != -1) {
				if((r>=65 && r<=90) || (r>=97 && r<=122) || r==32) {
					System.out.print((char)r);
				}
			}
		} catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
