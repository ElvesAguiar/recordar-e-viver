package application;

import java.util.List;
import java.util.stream.Collectors;

public class SomaElementosPares {

    public static int somaPares(List<Integer> lista) {
        int soma = 0;
        List<Integer> par=lista.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        for(Integer x : par) {
        	soma+=x;
        }
        return soma;
    }

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 4, 6, 9, 10, 12);
        int soma = somaPares(lista);
        System.out.println(soma);
    }
}