public class Exercicio6 {
    public static void main(String[] args) {
        int[] a = {-1, -2, 3, 4, 5, 6, -7, 7, 8, -8, 9, 10, -20, -11, -13};
        boolean[] b = GetVetorNegativo(a);

        for (boolean b2 : b)
            System.out.printf("%b ", b2);
    }

    public static boolean[] GetVetorNegativo(int[] a) {
        boolean[] b = new boolean[15];

        for (int i = 0; i < 15; ++i) {
            if (a[i] > 0)
                b[i] = true;
            else
                b[i] = false;
        }

        return b;
    }
}
