// Vou deduzir que o enunciado quis dizer colunas ao invés de linhas

public class Exercicio5 {
    public static void main(String[] args) {
        double aArray[][] = new double[10][6];
        System.out.printf("A matriz possui %d coluna(s)\n", GetNumeroColunas(aArray));

        aArray = new double[4][3];
        System.out.printf("A matriz possui %d coluna(s)\n", GetNumeroColunas(aArray));
    }

    public static int GetNumeroColunas(double aArray[][]) {
        return aArray[0].length;
    }
}
