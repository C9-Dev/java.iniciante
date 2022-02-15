package reploop;

public class RepLoop {

    public static void main(String[] args) {
        int igual, valor = 5;
        for(int i = 1; i <= 10; ++i){
            igual = valor * i;
            System.out.println(valor + " x " + i + " = " + igual);
        }
    }
    
}
