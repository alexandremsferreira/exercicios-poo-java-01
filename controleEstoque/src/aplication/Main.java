package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Digite Nome, Preço e Quantidade: ");
		System.out.print("- ");
		product.name = scann.nextLine();
		System.out.print("- ");
		product.price = scann.nextDouble();
		System.out.print("- ");
		product.quantity = scann.nextInt();

		product.out();
		
		System.out.print("\n\nDeseja adicionar mais produtos ao estoque?\nDigite a quantidade: ");
		product.addProducts(scann.nextInt());
		
		product.out();
		
		System.out.print("\n\nDeseja remove produtos do estoque?\nDigite a quantidade: ");
		product.RemoveProducts(scann.nextInt());

		product.out();

		scann.close();
	}

}
