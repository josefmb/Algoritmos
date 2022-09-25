import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] aArray = new int[5][5];
        Random num = new Random();

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                aArray[i][j] = num.nextInt(100);

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
