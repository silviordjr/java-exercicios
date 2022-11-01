package application;

import java.util.Scanner;
import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Students student = new Students();
		
		System.out.println("Entre os dados do aluno");
		
		System.out.print("Nome:");
		student.name = sc.next();
		
		System.out.println("Notas");
		student.a = sc.nextDouble();
		student.b = sc.nextDouble();
		student.c = sc.nextDouble();
		
		String message = student.status();
		
		System.out.println(message);
		
		sc.close();

	}

}
