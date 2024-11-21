package Estrutura.Funcoes;

import java.util.Scanner;

public class FuncaoSintaxe {
    public static void main (String[]args){
        int a,b,c;

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite os tres primeiros numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maximo = max(a,b,c);
        showResult(maximo);
        sc.close();
    }
    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > x && y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior = " + value);
    }
}
