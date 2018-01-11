package com.sriramislearning.java.codeproject;

import java.util.Scanner;

public class CodeProject {


	public void ScanInputAndPrintToConsole() {
		Scanner scan = new Scanner(System.in);

		String inputString = scan.nextLine();

		scan.close();

		System.out.println("Hello World");

		System.out.println(inputString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodeProject execute = new CodeProject();
		execute.ScanInputAndPrintToConsole();

	}

}
