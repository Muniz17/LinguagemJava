package Estrutura.Sequencial;

import java.util.Scanner;

public class EntradaDeDados1 {
    public static void main (String[]args){

        Scanner sc = new Scanner (System.in);
        String x;
        x= sc.next();
        System.out.println("Nome: " + x );

        int y;
        y =  sc.nextInt();
        System.out.println("Idade: " + y );

        double z;

        z = sc.nextDouble();
        System.out.printf("Quanto tem na conta: %.2f\n", z);


        //Como colocar mais de uma variavel//
        String a;
        int  b;
        double c;

        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();

    }
}
