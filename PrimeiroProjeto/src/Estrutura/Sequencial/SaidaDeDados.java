package Estrutura.Sequencial;

public class SaidaDeDados {
    public static void main (String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 39;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %.2f \n ", product1, price1);
        System.out.printf("%s, which price is $ %.2f \n", product2,price2);
        System.out.printf("%d years old, code %d and gender %c \n",age,code,gender );
        System.out.printf("measue with eight decimal places: %f\n" ,measure);
        System.out.printf("reuded %.3f\n",measure);
        System.out.printf("US decimal point %.3f\n",measure);
    }
}
