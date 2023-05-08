package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioPredicate {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bia");
        nomes.add("Carlos");
        nomes.add("Daniel");
        nomes.add("Amanda");
        nomes.add("Alex");
        nomes.add("Felipe");
        nomes.add("Alice");

        

        List<String> nomesComA = nomes.stream().filter(n -> n.toUpperCase().charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(nomesComA);
    }
}
