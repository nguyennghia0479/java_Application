package tuan1;

import java.util.Scanner;

public class Lab1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer option;
		do {
			System.out.println("\n=========MENU=========");
			System.out.println("1. Do exercise 1");
			System.out.println("2. Do exercise 2");
			System.out.println("3. Do exercise 3");
			System.out.println("4. Do exercise 4");
			System.out.println("5. Exit");
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
				exercise4();
				break;
			case 5:
				System.out.println("\n=========GOODBYE========= :))");
			default:
				System.out.println("Your option is not valid :((");
				break;
			}
		} while (option != 5);
	}

	@SuppressWarnings("resource")
	public static void exercise1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String fullName = scanner.nextLine();

		System.out.print("Enter average mark: ");
		Float aveMark = scanner.nextFloat();

		System.out.println("Full name: " + fullName + " - Average Mark: " + aveMark);
	}

	@SuppressWarnings("resource")
	public static void exercise2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length: ");
		Float length = scanner.nextFloat();

		System.out.print("Enter width: ");
		Float width = scanner.nextFloat();

		System.out.println("Perimeter Rectangle: " + ((length + width) * 2));
		System.out.println("Area rectangle: " + (length * width));
		System.out.println("Min edge: " + Math.min(length, width));
	}

	@SuppressWarnings("resource")
	public static void exercise3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the edge of the cube: ");
		Float edge = scanner.nextFloat();

		System.out.println("Cube volume: " + Math.pow(edge, 3));
	}

	@SuppressWarnings("resource")
	public static void exercise4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the coefficient a: ");
		Float a = scanner.nextFloat();

		System.out.print("Enter the coefficient b: ");
		Float b = scanner.nextFloat();

		System.out.print("Enter the coefficient c: ");
		Float c = scanner.nextFloat();

		Float delta = (float) Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Delta is less than 0 => Unable to calculate");
		} else {
			System.out.println("Square root of delta: " + Math.sqrt(delta));
		}
	}
}