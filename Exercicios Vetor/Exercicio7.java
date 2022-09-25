public class Exercicio7 {
    public static void main(String[] args) {
        double[] d = new double[10];

        for (int i = 0; i < 10; ++i)
            d[i] = Math.random() * 100;

        int iRes = GetPosicaoMaiorNumero(d);
        System.out.printf("O maior número está no índice %d.", iRes);
    }

    public static int GetPosicaoMaiorNumero(double[] d) {
        int iRes = 0;
        double dMaior = 0;

        for (int i = 0; i < 10; ++i)
        {
            if (dMaior >= d[i])
                continue;

            dMaior = d[i];
            iRes = i;
        }

        return iRes;
    }
}
