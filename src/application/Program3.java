package application;

import entities.Carro;
import entities.Circle;
import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Carro c = new Carro("honda","fit",2020);
		System.out.println(c.idade());
		
		
		Double[] notas = {2.9,4.0,9.0};
		
		Student s = new Student("ana",15,notas) ;
		
		System.out.println(s.media(s));
		
		Circle ci = new Circle(5.0);
		
		System.out.println(ci.area());
		
		
		
	}
	
	
	
}
