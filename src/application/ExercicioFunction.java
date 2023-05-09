package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioFunction {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Marta");


        List<Character> primeirasLetras = nomes.stream().map( x -> x.charAt(0)).collect(Collectors.toList());

        System.out.println(primeirasLetras);
    }


}