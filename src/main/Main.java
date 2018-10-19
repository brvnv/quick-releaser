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
	}
}
