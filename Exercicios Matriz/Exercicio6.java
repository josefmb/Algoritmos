public class Exercicio6 {
    public static void main(String[] args) {
        double aArray[][] = {{10, 1, 2}, {2, 4, 6.5}, {1.1, 6.6, 9}};
        System.out.printf(toString(aArray));
    }

    public static String toString(double aArray[][]) {
        String sRes = "Array:\n\n";

        for (int i = 0; i < aArray.length; ++i) {
            for (int j = 0; j < aArray[0].length; ++j) {
                sRes += "Linha: " + i + " Coluna: " + j;
                sRes += " Valor: " + aArray[i][j] + "\n";
            }
        }
        
        return sRes;
    }
}
