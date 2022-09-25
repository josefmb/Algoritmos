public class Exercicio4 {
    public static void main(String[] args) {
        double aArray[][] = new double[10][2];
        System.out.printf("A matriz possui %d linha(s)\n", GetNumeroLinhas(aArray));

        aArray = new double[4][3];
        System.out.printf("A matriz possui %d linha(s)\n", GetNumeroLinhas(aArray));
    }

    public static int GetNumeroLinhas(double aArray[][]) {
        return aArray.length;
    }
}
