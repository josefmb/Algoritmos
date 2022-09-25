import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] aNum = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            System.out.print("\nInforme um número: ");
            aNum[i] = teclado.nextInt();
        }
        
        int iRes = GetQtdNegativos(aNum);
        System.out.printf("A quantidade de números negativos é: %d", iRes);

        teclado.close();
    }

    public static int GetQtdNegativos(int[] aNum) {
        int iRes = 0;

        for (int i : aNum)
            if (i < 0)
                ++iRes;

        return iRes;
    }
}
