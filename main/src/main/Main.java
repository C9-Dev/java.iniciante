package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valor1 = 17;
        double valor2 = 13.13; 
        String nome = "Bruno";
        Scanner rec = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        valor1 = rec.nextInt();
        System.out.println("Digite um valor: ");
        valor2 = rec.nextDouble();
        System.out.println("Digite seu nome: ");
        nome = rec.nextLine();
    }
    
}
