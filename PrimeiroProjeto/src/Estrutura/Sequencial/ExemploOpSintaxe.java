package Estrutura.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExemploOpSintaxe {
    public  static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int minutos;
        double valor = 50;

        System.out.print("Quantos minutos foram utilizados?");
        minutos = sc.nextInt();
        if (minutos > 100){
            valor = valor + (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta é de $%.2f Reais", valor);

    }
}

