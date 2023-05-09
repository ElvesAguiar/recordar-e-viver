package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioFunction2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrados = numeros.stream().map(x -> x*2).collect(Collectors.toList());

        System.out.println(numerosDobrados);
    }

   
}
