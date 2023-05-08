package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
       return idade.compareTo(outraPessoa.idade);
    }

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("João", 25));
        lista.add(new Pessoa("Maria", 30));
        lista.add(new Pessoa("Pedro", 20));

        // Ordene a lista por idade usando o método sort da classe Collections
        Collections.sort(lista);

        // Imprima a lista ordenada
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.nome + " - " + pessoa.idade);
        }
    }
}