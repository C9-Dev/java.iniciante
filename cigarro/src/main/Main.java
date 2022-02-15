package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int beck;
        double valor;
        Scanner rec = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        name = rec.nextLine();
        System.out.println("Digite quantos cigarros você fumou hoje: ");
        beck = rec.nextInt();
        System.out.println("Digite quanto custa o cigarro: ");
        valor = rec.nextDouble();
        System.out.println(name + " você gastou hoje R$" + beck * valor);
    }
    
}
