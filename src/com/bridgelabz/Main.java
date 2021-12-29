package com.bridgelabz;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {

		String string = "An,algorithm,is,a,set,of,instructions,for,solving,logical,and,mathematical,problems";
		String[] stringArray = string.split(",");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n0 for exit \n1 for search \n2 for insertion sorting "
					+ "\n3 for bubbleSort");
			int num = scanner.nextInt();

			switch (num) {

			case 0:
				System.out.println("--------END--------");
				break;
			case 1:
				System.out.println("enter a word to search");
				String str = scanner.next();
				int result = SortingAlgorithm.binarySearch(stringArray, str);

				if (result == -1)
					System.out.println("Element not present");
				else
					System.out.println("Element found at " + "index " + result);
				break;
			case 2:
				SortingAlgorithm.insertionSort(stringArray);
				break;
			case 3:
				SortingAlgorithm.bubbleSorting(stringArray);
				break;
			default:
				System.out.println("enter valid case number ");
			}
			if (num == 0) {
				break;
			}
		}
	}
}
