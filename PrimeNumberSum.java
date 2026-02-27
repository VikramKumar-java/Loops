package com.vikramkumar.Loops;

import java.util.Scanner;

public class PrimeNumberSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a = scanner.nextInt();
		System.out.println("enter the second number:");
		int b = scanner.nextInt();
		int c = 0;
		
		while(a<=b) {
			
			if(a%2==0) {
				c+= a;
			}
			a++;
		}
		 
		System.out.println("the sum of even numbers is :"+c);
		scanner.close();

	}

}
