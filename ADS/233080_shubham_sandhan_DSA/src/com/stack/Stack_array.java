package com.stack;

import java.util.Scanner;

public class Stack_array {

	public static void main(String[] args) {
		int d;
		int l;

		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();

		do {
			System.out.println("Press 1 to push");
			System.out.println("Press 2 to pop");
			System.out.println("Press 3 to display");
			System.out.println("Enter Your Choice");
			d = sc.nextInt();

			switch (d) {
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			default:
				System.out.println("Invalid choice");
			}

			sc.nextLine();

			System.out.println("Enter 0 to go back to the main menu");
			System.out.println("Enter any other key to exit");
			l = sc.nextInt();

		} while (l == 0);

		System.out.println("Exit Success");
	}
}
