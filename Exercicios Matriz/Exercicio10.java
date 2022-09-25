import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] aSaida = getMatrizTeclado();

        for (int i = 0; i < aSaida.length; ++i) {
            System.out.println();
            for (int j = 0; j < aSaida[0].length; ++j)
                System.out.printf("%d ", aSaida[i][j]);
        }
    }

    public static int[][] getMatrizTeclado() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nQuantas linhas terá a matriz? ");
        int iLinhas = teclado.nextInt();
        System.out.print("\nQuantas colunas terá a matriz? ");
        int iColunas = teclado.nextInt();

        int[][] aArray = new int[iLinhas][iColunas];

        for (int i = 0; i < aArray.length; ++i) {
            for (int j = 0; j < aArray[0].length; ++j) {
                System.out.printf("\nInsira um valor para a linha %d coluna %d: ", i, j);
                aArray[i][j] = teclado.nextInt();
            }
        }

        teclado.close();

        return aArray;
    }
}
