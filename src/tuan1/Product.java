package tuan1;

import java.util.Scanner;

public class Product {
	private String name;
	private Float price;
	private Float sale = (float) 0;

	public Product() {

	}

	public Product(String name, Float price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, Float price, Float sale) {
		this.name = name;
		this.price = price;
		this.sale = sale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getSale() {
		return sale;
	}

	public void setSale(Float sale) {
		this.sale = sale;
	}

	@SuppressWarnings("resource")
	public void inputProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter product name: ");
		this.name = scanner.nextLine();

		scanner = new Scanner(System.in);
		System.out.print("Enter price: ");
		this.price = scanner.nextFloat();

		scanner = new Scanner(System.in);
		System.out.print("Enter sale: ");
		this.sale = scanner.nextFloat();
	}

	@SuppressWarnings("resource")
	public void inputArrayProduct() {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number of product: ");
			number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("Number of product must be greater than 0 :((");
			}
		} while (number <= 0);

		Product[] productArray = new Product[number];
		for (int i = 0; i < productArray.length; i++) {
			Product product = new Product();
			product.inputProduct();
			productArray[i] = product;
		}

		for (Product product : productArray) {
			System.out.println("\nProduct name: " + product.name);
			System.out.println("Price: " + product.price);
			System.out.println("Sale: " + product.sale);
		}

	}

	public void outputProduct() {
		System.out.println("\nProduct name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Sales: " + this.sale);
		System.out.println("Taxes: " + calculatorTaxesProduct(this.price));
	}

	private Float calculatorTaxesProduct(Float price) {
		return (float) (price * 0.1);
	}
}