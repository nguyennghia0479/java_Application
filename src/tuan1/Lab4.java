package tuan1;

import java.util.Scanner;

public class Lab4 {

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
			System.out.println("5. Do exercise 5");
			System.out.println("6. Exit");
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
				exercise5();
			case 6:
				System.out.println("\n*********GOODBYE********* :))");
				break;
			default:
				System.out.println("\nYour option is not valid :((");
				break;
			}
		} while (option != 6);

	}

	public static void exercise1() {
		Product product = new Product("Playstation 5 Pro", (float) 1499.99);
		product.outputProduct();
	}

	public static void exercise2() {
		Product product1 = new Product();
		Product product2 = new Product();

		// Nhập sản phẩm
		product1.inputProduct();
		product2.inputProduct();

		// Xuất sản phẩm
		product2.outputProduct();
		product1.outputProduct();
	}

	public static void exercise3() {
		Product product1 = new Product("PES 2020", (float) 149.99);
		Product product2 = new Product("Call of duty Black Ops IIII", (float) 299.99, (float) 0.1);

		product1.outputProduct();
		product2.outputProduct();
	}

	@SuppressWarnings("resource")
	public static void exercise4() {
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		System.out.print("Enter product name: ");
		String name = scanner.nextLine();

		scanner = new Scanner(System.in);
		System.out.print("Enter price: ");
		Float price = scanner.nextFloat();

		scanner = new Scanner(System.in);
		System.out.print("Enter sales: ");
		Float sale = scanner.nextFloat();

		product.setName(name);
		product.setPrice(price);
		product.setSale(sale);
		product.outputProduct();
	}

	public static void exercise5() {
		Product product = new Product();
		product.inputArrayProduct();
	}
}
