package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioConsumerFormat {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 10, 22, 3, 4);
	
		numeros.stream().forEach((x) -> {
			if ((x < 10) && (x > -10)) {
				System.out.printf("0%d%n", x);
			} else {
				System.out.println(x);
			}
		});

	}
}