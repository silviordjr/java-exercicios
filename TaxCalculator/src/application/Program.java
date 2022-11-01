package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.println("informe o número de contribuintes: ");
		Integer number = sc.nextInt();
		
		for (int i = 0; i < number; i ++) {
			System.out.printf("Dados do contribuinte #%d \n", i + 1);
			
			System.out.println("Nome: ");
			String name = sc.next();
			
			System.out.println("Renda anual: ");
			Double annualIncome = sc.nextDouble();
			
			System.out.println("PF ou PJ: ");
			String type = sc.next();
			
			if (type.equalsIgnoreCase("pf")) {
				System.out.println("Gastos com saude: ");
				Double healthSpending = sc.nextDouble();
				
				list.add(new NaturalPerson(name, annualIncome, healthSpending));
			} else {
				System.out.println("Numero de funcionarios: ");
				Integer employees = sc.nextInt();
				
				list.add(new LegalPerson(name, annualIncome, employees));
			}
		}
		
		for (int j = 0; j < number; j++) {
			Double tax = list.get(j).incomeTax();
			String name = list.get(j).getName();
			
			System.out.printf("%s deve pagar %.2f de impostos no ano \n", name, tax);
		}
		
		sc.close();
	}

}
