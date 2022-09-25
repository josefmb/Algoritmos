import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Informe o seu salário: ");

        Scanner teclado = new Scanner(System.in);
        float fSalario = teclado.nextFloat();

        float fQtdSalariosMinimos = fSalario / 788f;
        System.out.println("Você ganha " + fQtdSalariosMinimos + " salarios minimos.");

        teclado.close();
    }
}
