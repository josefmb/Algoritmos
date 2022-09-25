public class Exercicio1 {
    public static void main(String[] args) {
        int[] aVetor  = new int[11];

        PreenchePrimeiroVetor(aVetor);
        PreencheSegundoVetor (aVetor);
        PreencheTerceiroVetor(aVetor);
        PreencheQuartoVetor  (aVetor);
    }

    public static void PreenchePrimeiroVetor(int[] aVetor) {
        int iNum = 10;

        System.out.print("Primeiro Vetor: ");

        for (int i = 0; i < 10; ++i) {
            aVetor[i] = iNum;
            System.out.printf("%d ", aVetor[i]);
            --iNum;
        }
    }

    public static void PreencheSegundoVetor(int[] aVetor) {
        System.out.print("\nSegundo Vetor: ");

        for (int i = 0; i <= 10; ++i) {
            double aux = Math.pow(i, 2);
            aVetor[i] = (int)aux;
            System.out.printf("%d ", aVetor[i]);
        }
    }

    public static void PreencheTerceiroVetor(int[] aVetor) {
        System.out.print("\nTerceiro Vetor: ");

        int j = 0;

        for (int i = 0; i < 10; ++i) {
            ++j;

            if (j >= 6) {
                int aux = (j - 5) * 10;
                aVetor[i] = aux;
            } else {
                aVetor[i] = j;
            }

            System.out.printf("%d ", aVetor[i]);
        }
    }

    public static void PreencheQuartoVetor(int[] aVetor) {
        System.out.print("\nQuarto Vetor: ");

        int iSomador = 1;
        int iSomante = 3;

        for (int i = 0; i < 10; ++i) {
            if (i == 0) {
                aVetor[i] = iSomante;
                System.out.printf("%d ", aVetor[i]);
            } else {
                iSomante += iSomador;
                iSomador += 2;
                aVetor[i] = iSomante;
                System.out.printf("%d ", aVetor[i]);
            }
        }
    }
}