package application;

import java.util.Scanner;

import entities.Triangle;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the mesures of triangle X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the mesures of triangle Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangle X Area: %.4f%n", areaX);
		System.out.printf("Triangle Y Area: %.4f%n", areaY);

		System.out.print("Greater area is: ");

		if (areaX > areaY) {
			System.out.println("areaX");
		} else {
			System.out.println("areaY");
		}

		sc.close();

	}

}
