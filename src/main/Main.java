package main;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		System.out.println("Tell me where's the file with the latest releases.");
		Scanner scan=new Scanner(System.in);
		try{
		String sc=scan.nextLine();
	FileReader file=new FileReader(sc);
		BufferedReader buf=new BufferedReader(file);
		System.out.println("Processing...");
		String process=buf.readLine();
		System.out.println(process);
		while(process!=null) { // do while file is not finished
			if(process.matches("D(.*)")) System.out.println("começou com d");
//			else addsRel();
			}
		System.out.println("Done. You're welcome.");
		file.close();
		}
		catch (IOException e) {
			System.out.println("Ah, don't waste my time, this file doesn't even exist...");
		}
	}

public static void addsRel() {
	String $relname=process;
	System.out.println("+addrel" + $cat + " " + relname);
}

public static void addsCat() {
	int lineLength=process.length();
	System.out.println(lineLength + "\n" + process);
//String $cat=process.substring(1, lineLength-2);
}
}