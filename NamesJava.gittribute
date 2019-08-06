package Assignemnt4;

import java.util.Scanner;

public class Names {

	private String[] names = {};
	private static int currentSize;

	Scanner input = new Scanner(System.in);

	Names() {
		names = new String[10];

	}

	void Names(int currentSize) {
		names = new String[currentSize];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		input.nextInt();
	}

	void insertNames() {
		names = new String[0];
		System.out.println("Enter name: ");
		input.nextLine();
		for (int i = 0; i < names.length; i++) {
			String temp = input.nextLine();
			names[i] = temp.toLowerCase();
			if (i == (names.length)) {
				System.err.println("The array is full, cannot add more names");
			}
		}
	}

	void printNames() {
		int k = 0;
		if (k > names.length) {
			for (k = 0; k < names.length; k++) {
				System.out.println("The names inserted into the array are: ");
				System.out.println(names[k]);
			}
		}

		if (k > names.length) {
			System.err.println("No names in the array");
		}

	}

	int searchName(String names[]) {
		for (int l = 0; l < names.length; l++) {
			System.out.println(names[l]);
		}
		int m = 0;
		System.out.println("Enter the name to be searched: ");
		String loc = input.nextLine();
		String locName = loc.toLowerCase();

		for (int l = 0; l < names.length; l++) {
			if (locName.equals(names[l])) {
				m = 1;
				break;
			} else {
				m = 0;
			}
		}
		if (m == 1) {
			System.out.println("Match found for: " + locName);
		} else if (m == 0) {
			System.err.println("No Match found for: " + locName);
		}

		return m;

	}

	int findNumOfOccurrences(String names[]) {
		System.out.print("Enter name: ");
		input.nextLine();
		int count = 0;
		for (int o = 0; o < names.length; o++) {
			if (input.equals(names[o]))
				count++;
			System.out.println("The number of occurences of a name are: ");
			input.close();
		}
		return count;
	}

}
