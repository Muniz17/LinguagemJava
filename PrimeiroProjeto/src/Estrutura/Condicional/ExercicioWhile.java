package Estrutura.Condicional;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Bom dia");
        System.out.println("Selecione 1-alcool 2-gasolina 3-diesel");


        int tipo = sc.nextInt();
        while (tipo != 4) {
            if(tipo == 1){
               alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: "+ alcool);
        System.out.println("gasolina: " + gasolina);
        System.out.println("Diesel: "+ diesel);


        sc.close();
    }
}
