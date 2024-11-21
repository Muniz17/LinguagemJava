package Estrutura.Repetitiva;

import java.util.Scanner;

public class EstruturaRepetitiva3 {
    //O bloco de comando executa pelo menos uma vez, pois a condição é verificada no final
    // do {
    //comandos
    // }while (Condição);

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        double f,c;
        char r;

        do{
            System.out.print("digite a temperatura em Celcius: ");
            c = sc.nextInt();
            f = (9 * c)/5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);

            System.out.println("Deseja repetir S/N ");
            r = sc.next().charAt(0);
        } while (r != 'n');
            System.out.println( "Muito obrigado!");


        sc.close();
    }
}
