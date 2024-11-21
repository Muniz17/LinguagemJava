package Estrutura.Repetitiva;

import java.util.Scanner;
//WHILE (ENQUANTO)
//Repete até a condição ser verdadeira
public class EstruturaRepetitiva1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Precione os numeros que deseja somar, se quiser encerrar o programa digite '0'");
        int x = sc.nextInt();
        int soma =  0;
        while(x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);





        sc.close();
    }
}
