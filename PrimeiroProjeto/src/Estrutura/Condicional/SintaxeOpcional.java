package Estrutura.Condicional;

import java.util.Scanner;

public class SintaxeOpcional {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        String dias;
        System.out.print("Selecione um dia em numeros da semana: ");
        x= sc.nextInt();
        dias = switch (x) {
            case 1 -> "Domingo ";
            case 2 -> "Segunda ";
            case 3 -> "Terça  ";
            case 4 -> "Quarta ";
            case 5 -> "Quinta ";
            case 6 -> "Sexta ";
            case 7 -> "Sabado ";
            default -> "Invalído";
        };
        System.out.printf("dia da semana: %s",dias  );
        sc.close();
    }
}
