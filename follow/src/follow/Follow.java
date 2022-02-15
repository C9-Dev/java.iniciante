
package follow;
 import java.util.Scanner;

public class Follow {

    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        double soma, v1, v2, v3;
        System.out.println("Digite o primeiro valor:");
        v1 = rec.nextDouble();
        System.out.println("Digite o segundo valor:");
        v2 = rec.nextDouble();
        System.out.println("Digite o terceiro valor:");
        v3 = rec.nextDouble();
        soma = ((v1 + v2 + v3) * 10) / 2;
        System.out.println(soma);
    }
    
}
