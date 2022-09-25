public class Exercicio7 {
    public static void main(String[] args) {
        double aArray[][] = {{10, 1, 2}, {2, 4, 13.576}, {1.1, 6.6, 9}};
        System.out.printf("%.2f", getMaior(aArray));
    }

    public static double getMaior(double aArray[][]) {
        double dMaior = 0;

        for (int i = 0; i < aArray.length; ++i)
            for (int j = 0; j < aArray[0].length; ++j)
                if (dMaior < aArray[i][j])
                    dMaior = aArray[i][j];
        
        return dMaior;
    }
}
