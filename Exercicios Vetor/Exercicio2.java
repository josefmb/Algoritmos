public class Exercicio2 {
    public static void main(String[] args) {
        double[] a = new double[10];
        double rand = 0;

        System.out.print("Vetor: ");

        for (int i = 0; i < 10; ++i) {
            rand = Math.random() * 100;
            a[i] = rand;

            System.out.printf("%.3f ", a[i]);
        }
    }
}
