import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] d = new double[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.print("\nInsira um numero: ");
            d[i] = teclado.nextDouble();
        }

        teclado.close();
    }
}
