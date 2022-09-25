public class Exercicio9 {
    public static void main(String[] args) {
        int aArray[][] = {{10, 1, 2}, {2, 4, 13}, {1, 6, 9}};
        System.out.printf("\n%.2f", getMediaLinha(aArray, 2));
        System.out.printf("\n%.2f", getMediaLinha(aArray, 3));
    }

    public static float getMediaLinha(int aArray[][], int iLinha) {
        if (iLinha >= aArray.length)
            return 0;

        float iMedia = 0;
        for (int j = 0; j < aArray[0].length; ++j)
            iMedia += aArray[iLinha][j];

        iMedia /= aArray[iLinha].length;
        
        return iMedia;
    }
}
