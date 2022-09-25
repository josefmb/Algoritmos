import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double[][] aArray = new double[2][5];
        Scanner teclado = new Scanner(System.in);

        for (int i =0; i < aArray.length; ++i) {
            for (int j = 0; j < aArray[0].length; ++j) {
                System.out.print("\nInforme um valor: ");
                aArray[i][j] = teclado.nextDouble();
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < aArray.length; ++i) {
            System.out.println();
            for (int j = 0; j < aArray[0].length; ++j)
                System.out.printf("%.3f ", aArray[i][j]);
        }
        
        teclado.close();
    }
}
