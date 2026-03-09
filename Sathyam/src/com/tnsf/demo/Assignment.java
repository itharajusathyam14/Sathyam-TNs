package com.tnsf.demo;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string:");

		String str = sc.nextLine();

		String lower = "";
		String upper = "";

		for(int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if(ch >= 'A' && ch <= 'Z') {
				upper = upper + ch;
			}
			else {
				lower = lower + ch;
			}
		}

		System.out.println(lower + upper);

		sc.close();
	}
}