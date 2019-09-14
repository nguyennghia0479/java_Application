package tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer option;
		do {
			System.out.println("\n*********MENU*********");
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
				System.out.println("\n*********GOODBYE********* :))");
				break;
			default:
				System.out.println("\nYour option is not valid :((");
				break;
			}
		} while (option != 5);
	}

	@SuppressWarnings("resource")
	public static void exercise1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int count = 1;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	public static void exercise2() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("\nMultiplication table " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

	@SuppressWarnings("resource")
	public static void exercise3() {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter the number of array elements: ");
			number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("\nThe number of array elements must be greater than 0");
			}
		} while (number <= 0);

		// Nhập mảng
		Integer[] array = new Integer[number];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a[" + i + "] = ");
			array[i] = scanner.nextInt();
		}

		// Sắp xếp và xuất mảng
		Arrays.sort(array);
		System.out.println("Sort array: " + Arrays.toString(array));

		// Tìm số nhỏ nhất trong mảng
		int min = array[0];
		System.out.println("Min: " + min);

		// Tính TBC các số chia hết cho 3
		int total = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				total = total + array[i];
				count++;
			}
		}
		System.out.println("Average: " + (total / count));
	}

	@SuppressWarnings("resource")
	public static void exercise4() {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter the number of array elements: ");
			number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("\n The number of array elements must be greater than 0");
			}
		} while (number <= 0);

		// Nhập mảng
		String[] fullName = new String[number];
		Float[] mark = new Float[number];
		String[] grade = new String[number];
		for (int i = 0; i < number; i++) {
			scanner = new Scanner(System.in);
			System.out.print("\nEnter a full name student " + (i + 1) + ": ");
			fullName[i] = scanner.nextLine();

			// Bắt lỗi nhập điểm
			do {
				scanner = new Scanner(System.in);
				System.out.print("Enter a mark student " + (i + 1) + ": ");
				mark[i] = scanner.nextFloat();
				if (mark[i] < 0 || mark[i] > 10) {
					System.out.println("\nPlease enter a mark form 0 to 10 :((");
				}
			} while (mark[i] < 0 || mark[i] > 10);
		}

		// Xét học lực
		for (int i = 0; i < number; i++) {
			if (mark[i] < 5) {
				grade[i] = "Yếu";
			} else if (mark[i] >= 5 && mark[i] < 6.5) {
				grade[i] = "Trung bình";
			} else if (mark[i] >= 6.5 && mark[i] < 7.5) {
				grade[i] = "Khá";
			} else if (mark[i] >= 7.5 && mark[i] < 9) {
				grade[i] = "Giỏi";
			} else {
				grade[i] = "Xuất sắc";
			}
		}

		for (int i = 0; i < number - 1; i++) {
			for (int j = i + 1; j < number; j++) {
				if(mark[j] < mark[i]) {
					Float temp = mark[i];
					mark[i] = mark[j];
					mark[j] = temp;
					
					String tempGrade = grade[i];
					grade[i] = grade[j];
					grade[j] = tempGrade;
					
					String tempName = fullName[i];
					fullName[i] = fullName[j];
					fullName[j] = tempName;
				}
			}
		}

		for (int i = 0; i < number; i++) {
			System.out.println("\nFull name : " + fullName[i]);
			System.out.println("Mark :" + mark[i]);
			System.out.println("Grade :" + grade[i]);
		}
	}
}