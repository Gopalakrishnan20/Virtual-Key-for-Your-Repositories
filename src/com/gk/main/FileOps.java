package com.gk.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Collections;
import java.util.Scanner;

public class FileOps {
	public static void listFiles() {
		final String path = "C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\VirtualKeyRepository\\src\\DirectoryPool";
		File file = new File(path);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("\t Available Files");
		System.out.println("\t From [A-Z]");
		String[] listofFiles = file.list();
		for (String s : listofFiles) {
			list.add(s);
		}
		// Collections.sort(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
//		File[] fileList=file.listFiles();
//		for(File f:fileList)
//		{
//			System.out.println(f); 			//to print files with location address
//		}

	}

	public static void addFile() {
		System.out.println("Add");

	}

	public static void deleteFile() {
		Scanner in=new Scanner(System.in);
		String fName;
		System.out.println("Enter the File name to be deleted:");
		fName=in.next();
		final String path="C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\VirtualKeyRepository\\src\\DirectoryPool" + "\\"
				+ fName;
		File file=new File(path);
		boolean present=file.isFile();
		if(present)
		{
			file.delete();
			System.out.println("\t File: "+fName+" Deleted Sucessfully.");
		}
		else if(!present)
		{
			System.out.println("\t File:"+fName+" NOT FOUND!\n");
			
		}
		
		
	}

	public static void searchFile() {
		Scanner in = new Scanner(System.in);
		String fName;
		System.out.println("Enter the File name to be searched:");
		fName = in.next();
		final String path = "C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\VirtualKeyRepository\\src\\DirectoryPool" + "\\"
				+ fName;
		File file = new File(path);
		boolean present = file.exists();
		if (present) {
			System.out.println("\t File: " + fName);
			System.out.println("\t FILE FOUND\n");

		} else if (!present) {
			System.out.println("\t File: " + fName);
			System.out.println("\t FILE NOT FOUND..!\n");
		}
	}

	public static void main(String[] args) {

	}
}
