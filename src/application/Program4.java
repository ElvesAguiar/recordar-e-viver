package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int[] vect = { 1, 2, 3 };

		for (int x : vect) {

		}

		System.out.println();

		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(6);

		System.out.println(list);

		System.out.println("----------------------------------------------");

//		list.removeIf(x -> x.equals(2));

		List<Integer> result = list.stream().sorted().filter(x -> x > 3).collect(Collectors.toList());
		int maior = -999999999;
		for (int num : list) {
			if (num > maior) {
				maior = num;
			}

		}
		int menor = maior;
		for (int num : list) {
			if (num < menor) {
				menor = num;
			}

		}

		System.out.println(result);

		System.out.println("---------------------------------------------------");
		System.out.println("Maior= "+maior+" Menor = "+menor);
	}
}
