package tuan1;

import java.util.Scanner;

public class Lab2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer option;
		do {
			System.out.println("\n*********MENU*********");
			System.out.println("1. Do exercise 1");
			System.out.println("2. Do exercise 2");
			System.out.println("3. Do exercise 3");
			System.out.println("4. Exit");
			System.out.print("You choose: ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				exercise1();
				break;
			case 2:
				exercise2();
				break;
			case 3:
				exercise3();
				break;
			case 4:
				System.out.println("\n*********GOODBYE********* :))");
				break;
			default:
				System.out.println("\nYour option is not valid :((");
				break;
			}
		} while (option != 4);
	}

	@SuppressWarnings("resource")
	public static void exercise1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the coefficient a: ");
		Float a = scanner.nextFloat();

		System.out.print("Enter the coefficient b: ");
		Float b = scanner.nextFloat();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Equations countless solutions");
			} else {
				System.out.println("The equation has no solution");
			}
		} else {
			System.out.println("Solution of first-degree equations: " + (-b / a));
		}
	}

	@SuppressWarnings("resource")
	public static void exercise2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the coefficient a: ");
		Float a = scanner.nextFloat();

		System.out.print("Enter the coefficient b: ");
		Float b = scanner.nextFloat();

		System.out.print("Enter the coefficient c: ");
		Float c = scanner.nextFloat();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Equations countless solutions");
				} else {
					System.out.println("The equation has no solution");
				}
			} else {
				System.out.println("Solution of first-degree equations: " + (-c / b));
			}
		} else {
			Float delta = (float) (Math.pow(b, 2) - 4 * a * c);
			if (delta < 0) {
				System.out.println("Delta is less than 0 => Unable to calculate");
			} else if (delta == 0) {
				System.out.println("The equation has a double solution x1 = x2 = " + (-b / 2 * a));
			} else {
				System.out.println("The equation has 2 distinct solutions");
				System.out.println("x1: " + (-b + Math.sqrt(delta) / (2 * a)));
				System.out.println("x1: " + (-b - Math.sqrt(delta) / (2 * a)));
			}
		}
	}

	@SuppressWarnings("resource")
	public static void exercise3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount of electricity has used: ");
		Float amount = scanner.nextFloat();
		Float money;
		if (amount < 50) {
			money = amount * 1000;
		} else {
			money = 50 * 1000 + (amount - 50) * 1200;
		}
		System.out.println("Money: " + money);
	}
}