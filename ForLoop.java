package com.vikramkumar.Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number:");
		int firstnumber = scanner.nextInt();
		System.out.println("enter the endingnumber: ");
		int endingnumber = scanner.nextInt();
		int number = firstnumber;
		int sum =0;
		for(number=firstnumber;number<=endingnumber;number++) {
			System.out.println(number);
			sum+=number;
			
		}
		System.out.println(sum);
	}

}
