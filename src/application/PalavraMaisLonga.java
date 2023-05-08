package application;

import java.util.List;
import java.util.stream.Collectors;

public class PalavraMaisLonga {

    public static String palavraMaisLonga(List<String> lista) {
        
        int pl=0;
        int maior=0;
       for(String p : lista) {
    	   pl =p.length();
    	   if(pl>maior) {
    		   maior=pl;
    	   }
       }
       int novo= maior;
       List<String> var =lista.stream().filter(x -> x.length()==novo).collect(Collectors.toList());
        
        return var.get(0);
    }

    public static void main(String[] args) {
        List<String> lista = List.of("Java", "Python", "C++", "JavaScript", "HTML", "CSS");
        String palavra = palavraMaisLonga(lista);
        System.out.println(palavra);
    }
}