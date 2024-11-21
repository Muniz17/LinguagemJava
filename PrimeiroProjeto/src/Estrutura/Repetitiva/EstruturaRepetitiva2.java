package Estrutura.Repetitiva;

import java.util.Scanner;

public class EstruturaRepetitiva2 {
    public static void main(String[]args){
        //Repete um bloco de comandos para um certo intervalo de valores
        //vale lembrar que a contagem começa com zero
        // for ( inicio ; condição ; incremento ) {
        // Comandos
        // }

        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for (int i=0; i<N; i=i+1) { //"i" serve como um conatatdor e "N" é o limite deste contador
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);




        sc.close();
    }
}
