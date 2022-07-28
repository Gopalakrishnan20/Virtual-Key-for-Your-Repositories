package com.gk.main;

import java.io.File;
import java.util.Scanner;

public class FileOps  {
	public static void listFiles() {
		final String path = "C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\VirtualKeyRepository\\src\\DirectoryPool";
		File file = new File(path);
		System.out.println("\t Available Files");
		String[] listofFiles = file.list();
		for (String s : listofFiles) {
			System.out.println(s);
		}

	}
	public static void addFile() {
		
	}
	public static void deleteFile() {
		
	}
	public static void searchFile() {
		
	}

}
