package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Indique o número de empregados:");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.printf("Dados do funcionário %d: \n", i + 1);
			
			System.out.println("Nome: ");
			String nome = sc.next();
			
			System.out.println("Horas: ");
			Integer hours = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.println("Terceirizado (s/n)? ");
			Boolean outsourced = (sc.next().equalsIgnoreCase("s")) ? true : false;
			
			Employee newEmployee;
			
			if (outsourced) {
				System.out.println("Valor adicional: ");
				Double additionalCharge = sc.nextDouble();
				
				newEmployee = new OutsourcedEmployee(nome, hours, valuePerHour, additionalCharge);
			}
			
			newEmployee = new Employee(nome, hours, valuePerHour);
			
			list.add(newEmployee);
		}
	
		
		for (int j = 0; j < number; j++) {
			String employeeName = list.get(j).getName();
			Double payment = list.get(j).payment();
			
			System.out.printf("%s recebeu %.2f \n", employeeName, payment);
		}
		
		
		sc.close();
	}

}
