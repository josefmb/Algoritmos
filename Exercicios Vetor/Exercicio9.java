import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int a[] = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.print("\nInsira um número: ");
            a[i] = teclado.nextInt();
        }

        a = GetVetorParImpar(a);
        for (int i = 0; i < 10; ++i)
            System.out.printf("%d ", a[i]);

        teclado.close();
    }

    public static int[] GetVetorParImpar(int[] a) {
        for (int i = 0; i < 10; ++i) {
            if (a[i] % 2 == 0)
                a[i] = 1;
            else 
                a[i] = -1;
        }

        return a;
    }
}
