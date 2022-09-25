public class Exercicio8 {
    public static void main(String[] args) {
        int aArray[][] = {{10, 1, 2}, {2, 4, 13}, {1, 6, 9}};
        System.out.printf("%d", getSoma(aArray));
    }

    public static int getSoma(int aArray[][]) {
        int iSoma = 0;

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                iSoma += aArray[i][j];
        
        return iSoma;
    }
}
