package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double product_value;
        int parcela;
        double final_value;
        Scanner rec = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        product_value = rec.nextDouble();
        System.out.println("Digite 2, 4 ou 6 parcelas: ");
        parcela = rec.nextInt();
        if(parcela==2){
            final_value = product_value / parcela;
            System.out.println("O valor da parcela é: " + final_value);
        }
        else if(parcela==4){
            final_value = product_value / parcela;
            System.out.println("O valor da parcela é: " + final_value);
        }
        else{
            final_value = product_value / parcela;
            System.out.println("O valor da parcela é: " + final_value);
        }
    }
    
}
