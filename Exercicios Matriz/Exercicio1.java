public class Exercicio1 {
    public static void main(String[] args) {
        PreencheVetorUm();
        PreencheVetorDois();
        PreencheVetorTres();
        PreencheVetorQuatro();
    }

    public static void PreencheVetorUm() {
        int[][] aArray = new int[3][10];

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                aArray[i][j] = j;

        ImprimeVetor(aArray);
    }

    public static void PreencheVetorDois() {
        int[][] aArray = new int[5][10];

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                aArray[i][j] = j * j;

        ImprimeVetor(aArray);
    }

    public static void PreencheVetorTres() {
        int[][] aArray = new int[6][6];

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                aArray[i][j] = i;

        ImprimeVetor(aArray);
    }

    public static void PreencheVetorQuatro() {
        int[][] aArray = new int[9][6];

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                aArray[i][j] = (i % 2 == 0) ? -1 : 0;

        ImprimeVetor(aArray);
    }

    public static void ImprimeVetor(int[][] aArray) {
        System.out.print("\n");

        for (int i = 0; i < aArray.length; ++i) {
            System.out.print("\n");
            for (int j = 0; j < aArray[0].length; ++j)
                System.out.printf("%d ", aArray[i][j]);
        }
    }
}