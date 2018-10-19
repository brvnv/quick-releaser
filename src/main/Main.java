package main;

public class Main {
	import java.io.FileReader;
	import java.io.BufferedReader;
	import java.util.Scanner;

	public static void main(String[] args) {
		System.out.println("Tell me where's the file with the latest releases.");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		FileReader file=new FileReader(sc);
		BufferedReader buf=new BufferedReader(file);
		System.out.println("Processing...");
		String process=buf.readLine();
		while(process!=null) { // do while line is not finished
			if(process!matches("[")) addsRel();
			else addsCat();
		}
		System.out.println("Done. You're welcome.");
		file.close();
	}
}

public static void addsRel() {
	String $relname=process;
	System.out.println("+addrel" + $cat + " " + relname);
}

public static void addsCat() {
	String $cat=process.substring(1,(process.length());
}
}