package Estrutura;

import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Matheus";
        int idade = 21;
        double renda = 4000.0;

        System.out.println(y);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.3f%n",x);
        System.out.print("Olá Mundo ");
        System.out.println("Meu nome é Matheus");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);


        System.out.println("Resultado = "+x+" metros");
        System.out.printf("Resultado= %.2f metros%n",x);

        
        System.out.printf("Meu nome é %s  tenho %d anos e ganho %.2f reais%n",nome,idade,renda);


    }
}