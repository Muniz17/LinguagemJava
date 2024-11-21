package Estrutura.Sequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[]args) {
        int x,y,soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque um numero: ");
        x = sc.nextInt();

        System.out.print("Coloque outro numero: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.printf("A soma destes nuemros é: %d\n ", soma);

        double pi,raio,area;
        pi = 3.14159;

        System.out.print("Coloque o raio do cículo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio,2);

        System.out.printf("este é o raio: %.4f\n", area);
        int a,b,c,d,Resultado;

        System.out.print("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto numero: ");
        d = sc.nextInt();
        Resultado = a * b - c * d;
        System.out.printf("Esta é a diferença entre os numneros %d",Resultado);

        sc.close();
    }
}
