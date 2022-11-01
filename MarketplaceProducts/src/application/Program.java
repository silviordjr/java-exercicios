package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Products> list = new ArrayList<>();
		
		System.out.println("Numero de produtos a cadastrar: ");
		
		int quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			Products product;
			
			System.out.printf("Dados do produto #%d \n", i + 1);
			
			System.out.println("Nome: ");
			String name = sc.next();
			
			System.out.println("Preço: ");
			Double price = sc.nextDouble();
			
			System.out.println("Comum, usado ou importado (c/u/i)? ");
			String type = sc.next();
			
			if (type.equalsIgnoreCase("c")) {
				product = new Products(name, price);
			} else if (type.equalsIgnoreCase("u")) {
				System.out.println("Data de fabricação (dd/mm/aaaa): ");
				String date = sc.next();
				
				product = new UsedProduct(name, price, date);
			} else {
				System.out.println("Taxa de importação: ");
				Double tax = sc.nextDouble();
				
				product = new ImportedProduct(name, price, tax);
			}
			
			list.add(product);
		}
		
		for (int j = 0; j < quantity; j++) {
			String text = list.get(j).toString();
			System.out.printf("%s \n", text);
		}
		
		sc.close();

	}

}
