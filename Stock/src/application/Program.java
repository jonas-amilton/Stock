package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Products prod = new Products();
		
		System.out.println("enter the product data: ");
		System.out.println("Name ");
		prod.name = sc.nextLine();
		System.out.println("price ");
		prod.price = sc.nextDouble();
		System.out.print("quantity in stock ");
		prod.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("product data: " + prod);
		System.out.println();
		System.out.print("enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		
		System.out.println();
		System.out.print("Enter the number of products to be remove from stock: ");
		quantity = sc.nextInt();
		prod.removeProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + prod);
		
		
		
		sc.close();

	}

}
