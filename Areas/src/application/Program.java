package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre os valores do triangulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre os valores do triangulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("A área de X: %.2f%n", x.area());
		System.out.printf("A área de Y: %.2f%n", y.area());
	}
}
