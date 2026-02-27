package com.vikramkumar.Loops;

import java.util.Scanner;

public class ForPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number:");
		int firstnumber = scanner.nextInt();
		System.out.println("enter the endingnumber: ");
		int endingnumber = scanner.nextInt();
		int number = firstnumber;
		for( number=firstnumber;number<=endingnumber;number++) {
		   int	noOfDividents=0;
			if(number!=1 && number!=2) {
				for(int i =1;i<=number;i++) {
					if(number%i==0)
						noOfDividents++;
				}
			}
			if(noOfDividents<=2 && noOfDividents !=0)
				System.out.println(number);
		}
		scanner.close();
		
	}
}
