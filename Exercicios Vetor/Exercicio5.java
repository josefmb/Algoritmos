import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] aVetor = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9, 9};

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número que está procurando: ");
        int iBusca = teclado.nextInt();
        
        int iRes = GetQuantidadeAparicoes(aVetor, iBusca);

        System.out.printf("\nO número %d aparece %d vezes na lista.", iBusca, iRes);
        teclado.close();
    }
    
    public static int GetQuantidadeAparicoes(int[] aVetor, int iBusca) {
        int iRes = 0;

        for (int i : aVetor)
            if (i == iBusca)
                ++iRes;

        return iRes;
    }
}
