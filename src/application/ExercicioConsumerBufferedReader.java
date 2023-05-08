package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioConsumerBufferedReader {
    public static void main(String[] args) throws IOException {
        String arquivo = "C:\\temp\\temp.txt";

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

        leitor.lines().forEach((l)->{
        	l=l.toUpperCase();
        	System.out.println(l);
        });
        leitor.close();
    }
}