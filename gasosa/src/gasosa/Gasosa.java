package gasosa;

import java.util.Scanner;


public class Gasosa {

    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        double result, dist;
        System.out.println("Digite a distancia:");
        dist = rec.nextDouble();
        result = dist / 12;
        System.out.println("A quantidade gasta foi de: " + result);
    }
    
}
