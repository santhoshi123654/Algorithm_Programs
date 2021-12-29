package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {

		int primeNumber = 2;

		System.out.println("enter a number in between range of 0-1000 : ");
		Scanner scanner = new Scanner(System.in);
		int rangeNum = scanner.nextInt();
		System.out.println("prime numbers are in the range of 0 to " + rangeNum + "are : ");
		while (primeNumber <= rangeNum) {
			int temp = 0;
			for (int i = 2; i <= primeNumber / 2; i++) {

				if (primeNumber % i == 0) {
					temp++;
					break;
				}
			}
			if (temp == 0) {
				System.out.print(primeNumber + " ");
			}
			primeNumber++;
		}
	}
}
