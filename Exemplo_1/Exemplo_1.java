import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo_1{
    public static void main(String[] args){
        System.out.println("Java executing...");
        //declara um array de 10 elementos
        int v[] = new int[10];
        //títulos da coluna
        System.out.printf("%s%8s\n", "Indice", "Valor"); //gera saida do valor de cada elemento do array
        for(int i = 0; i < v.length; i++)
        {
            System.out.printf("%5d%8d\n", i, v[i]);
        }
        System.out.println("Fim do exemplo 1\n\n");
    }
}