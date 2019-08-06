package Assignemnt4;

import java.util.Scanner;

public class Assignment4 {
	int currentSize = 0;


	public static void main(String[] args) {
		Names n = new Names();
		n.Na
		int option;
		String[] names = {};
		Scanner input = new Scanner(System.in);
		System.out.println("Operations on Names \n" + "===================");
		System.out.println("1. Enter a name");
		System.out.println("2. Print all names");
		System.out.println("3. Search a name");
		System.out.println("4. Number of occurrences of a name");
		System.out.println("5. Exit");
		System.out.println("Enter your option:");
		option = input.nextInt();
		while (option > 5) {
			System.err.println("Invalid option, please enter a valid option.");
			option = input.nextInt();
		}

		switch (option) {
		case 1:
			n.insertNames();
			Assignment4.main(args);
			break;
		case 2:
			n.printNames();
			Assignment4.main(args);
			break;
		case 3:

			n.searchName(names);
			Assignment4.main(args);
			break;
		case 4:
			n.findNumOfOccurrences(names);
			Assignment4.main(args);
			break;
		case 5:
			System.out.println("Goodbye!");
			while (option != 5)
				;
			break;
		}
		input.close();
	}

}
