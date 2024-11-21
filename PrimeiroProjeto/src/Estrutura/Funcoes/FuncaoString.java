package Estrutura.Funcoes;



public class FuncaoString {
    public static void main (String[]args){
        /*
        Formatar: toLowerCase(),toUpperCase(),trim()
        minuscúlo, maiusculo, Remove espaço

        Recortar: substring(inicio), substring(inicio,fim)
         corta a quantidade de letras dentro dos ()

        Substituir: replance(char,char), replance (string,string)
        Substitui palavaras ou letras especificas

        Buscar: IndexOf,LastIndexOf
        pega o numero do texto e fala onde ele esta localizado

        str.Split(" ")
        divide a string em vetores por espaços ou algo definido */


        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace("a","x");
        String s07 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String[] vect = original.split(" ");
        String word1= vect[0];
        String word2= vect[1];
        String word3= vect[2];
        String word4= vect[3];
        String word5= vect[4];



        System.out.println("Original: - " + original + "-");
        System.out.println();
        System.out.println("split: -" + word2 +" " + word1 +" "+ word5 +" " + word3 +" " + word4 + " -");
        System.out.println();
        System.out.println("toLowerCase: - "+ s01 + "-");
        System.out.println();
        System.out.println("toUpperCase: - "+ s02 + "-");
        System.out.println();
        System.out.println("trim: - "+ s03 + "-");
        System.out.println();
        System.out.println("Substring(2): -" + s04 + "-");
        System.out.println();
        System.out.println("Substring(2,9): -" + s05 + "-");
        System.out.println();
        System.out.println("replance('a', 'x') : -" + s06 + "-");
        System.out.println();
        System.out.println("replance ('abc', 'xy') : -" + s07 + "-");
        System.out.println();
        System.out.println("IndexOf ('bc') - " + i +" -");
        System.out.println();
        System.out.println("LastIndexOf (bc) - " + j + " -");





        }
}
