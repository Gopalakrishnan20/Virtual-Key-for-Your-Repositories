package com.gk.main;

import java.util.Scanner;

public class App extends FileOps{
	public static void fileOps() {
		int opt, flag;
		do {
			flag = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("\t Available File Operations");
			System.out.println("\t 1.Add File");
			System.out.println("\t 2.Delete File");
			System.out.println("\t 3.Search File");
			System.out.println("\t 0.Back to Main Menu");
			System.out.println("\t Enter the Option:");
			opt = in.nextInt();
			switch (opt) {
			case 1:
				addFile();
				fileOps();
				break;
			case 2:
				deleteFile();
				fileOps();
				break;
			case 3:
				searchFile();
				fileOps();
				break;
			case 0:
				MainMenu();
				break;
			default:
				System.out.println("Invalid Input");
				flag=1;			
			}
		} while(flag==1);

	}
	public static void MainMenu(){
		int opt,flag;
		do {
		System.out.println("\t Virtual Key Repository");
		System.out.println("\\  / o ._ _|_      _. |   |/  _       |_)  _  ._   _   _ o _|_  _  ._  ");
		System.out.println(" \\/  | |   |_ |_| (_| |   |\\ (/_ \\/   | \\ (/_ |_) (_) _> |  |_ (_) | \\/ ");
		System.out.println("                                 /            |                      /  ");
		System.out.println("\t Developed by Gopalakrishnan");
		System.out.println("1.View Available Files");
		System.out.println("2.File Operations");
		System.out.println("0.Exit Application");
		System.out.println("Enter the Valid Option[0-2]:");
		Scanner in = new Scanner(System.in);
		opt = in.nextInt();
			flag=0;
			switch (opt) {
			case 1:
				listFiles();
				MainMenu();
				break;
			case 2:
				fileOps();
				break;
			case 0:
				System.out.println("Exiting Application....Goodbye!");
				break;
			default:
				System.out.println("Wrong Input Try again.");
				flag=1;
				break;
			}
		} while (flag == 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		MainMenu();

	}

}
