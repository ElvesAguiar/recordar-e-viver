package application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
	
		
		
//		System.out.println(soma(list));
		System.out.println(primo(5));

//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		sc.close();
	}

	public static int soma(List<Integer> list){
			int sum =0;
			for (int i = 1; i <= list.size(); i++) {
				sum+=list.get(list.indexOf(i));
			};
			return sum;
	}
	
	public static boolean primo (int num ) {
		boolean primo = true;
		if (num <= 1) {
	         primo = false;
	      } else {
	         for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	               primo = false;
	               break;
	            }
	         }
	      }
	      
		return primo;
	}
	
}
