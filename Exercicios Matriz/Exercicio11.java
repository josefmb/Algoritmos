public class Exercicio11 {
    public static void main(String[] args) {
        int aArray[][] = {{10, 1, 2}, {2, 4, 13}, {1, 6, 9}};
        aArray = SubstituiParImpar(aArray);

        for (int i = 0; i < aArray.length; ++i) {
            System.out.println();
            for (int j = 0; j < aArray[0].length; ++j)
                System.out.printf("%d ", aArray[i][j]);
        }
    }

    public static int[][] SubstituiParImpar(int aArray[][]) {
        for (int i = 0; i < aArray.length; ++i) {
            for (int j = 0; j < aArray[0].length; ++j) {
                if (aArray[i][j] % 2 == 0)
                    aArray[i][j] = 1;
                else
                    aArray[i][j] = -1;
            }
        }
        
        return aArray;
    }
}
