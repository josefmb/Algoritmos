import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int a[] = GetNumerosTeclado();

        for (int i = 0; i < 10; ++i)
            System.out.printf("%d ", a[i]);
    }

    public static int[] GetNumerosTeclado() {
        int res[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.print("\nInsira um número: ");
            res[i] = teclado.nextInt();
        }

        teclado.close();

        return res;
    }
}
