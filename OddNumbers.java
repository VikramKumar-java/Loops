package com.vikramkumar.Loops;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a = scanner.nextInt();
		System.out.println("enter the second number:");
		int b = scanner.nextInt();
		int number = a;
		while(number>=b) {
			if(number%2==1) {
				System.out.println("it is an odd number:"+number);
			}
			number--;
		}
		scanner.close();
	}

}
