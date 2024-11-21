package Estrutura.Funcoes;

public class FuncaoMatematica {
    public static void main (String[]args){
    /*
     A = Math.sqrt(X) - Variavel A recebe a raiz quadrada de X

     A = Math.pow(X, Y) - Variavel A recebe o resultado de X elevado a Y

     A =  Math.abs(X); - Variavel A recebe o valor absoluto de X

     */

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a,b,c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);

        System.out.println("A raiz quadrada de " + x +" = "+ a );
        System.out.println("A raiz quadrada de "+ y + " = " + b );
        System.out.println("A raiz quadrada de 25 =" + c );

        a = Math.pow(x,y);
        b = Math.pow(x,2.0);
        c = Math.pow(5.0, 2.0);

        System.out.println(x + " Elevado a " + y + " = " + a);
        System.out.println(x + " Elevado ao quadrado = " + b);
        System.out.println("5 elevado ao quadrado = " + c);

        a = Math.abs(y);
        b = Math.abs(z);

        System.out.println("Valor absoluto de " +y+ " = " + a);
        System.out.println("Valor absoluto de " +z+ " = " + b );


    }
}
