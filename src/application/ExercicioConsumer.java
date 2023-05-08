package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioConsumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       
        numeros.forEach((x) -> {
        	x *=2;
        	System.out.println(x);
        });
     

    }
}