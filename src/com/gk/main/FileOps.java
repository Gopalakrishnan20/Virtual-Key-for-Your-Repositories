package com.gk.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Collections;
import java.util.Scanner;

public class FileOps  {
	public static void listFiles() {
		final String path = "C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\VirtualKeyRepository\\src\\DirectoryPool";
		File file = new File(path);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("\t Available Files");
		System.out.println("\t From [A-Z]");
		String[] listofFiles = file.list();
		for (String s : listofFiles) {
			list.add(s);
		}
		//Collections.sort(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			System.out.println(name);
			}
//		File[] fileList=file.listFiles();
//		for(File f:fileList)
//		{
//			System.out.println(f); 			//to print files with location address
//		}


	}
	public static void addFile() {
		
	}
	public static void deleteFile() {
		
	} 
	public static void searchFile() {
		Scanner in=new Scanner(System.in);
		String fName;
		System.out.println("Enter the File name to be searched:");
		fName=in.next();
				
	}
public static void main(String[] args)
{
	
	
}
}
