package application;

import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Adicione produtos: ");
		System.out.println("Nome: ");
		String name = sc.next();
		System.out.println("Quantidade: ");
		int quantity = sc.nextInt();
		System.out.println("Preço: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price, quantity);
		
		System.out.printf("Existem R$%.2f em estoque. %n", product.totalInStock());
		System.out.println("Adicione produtos: ");
		
		quantity = sc.nextInt();
		
		product.addProduct(quantity);
		
		System.out.printf("Agora, existem R$%.2f em estoque. %n", product.totalInStock());
		System.out.println("Venda produtos: ");
		
		quantity = sc.nextInt();
		
		product.removeProduct(quantity);
		
		System.out.printf("Agora, existem R$%.2f em estoque. %n", product.totalInStock());
		
		sc.close();
	}
}
