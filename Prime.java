package com.vikramkumar.Loops;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the starting number");
		int startingnumber=scanner.nextInt();
		System.out.println("enter the ending number:");
		int endingnumber= scanner.nextInt();
		int number = startingnumber;
		while(number<endingnumber) {
			boolean isprime = true;
			if (number != 1 && number != 2) {
				int i = 2;
				while (i < number) {
					if (number % i == 0) {
						isprime = false;
						break;
					}
					i++;
				}

			} else
				isprime = false;
			if(isprime)
				System.out.println(number);
			number++;
		}

	}
}
