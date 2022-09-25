import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o Saldo: ");
        float fSaldo = teclado.nextFloat();

        fSaldo *= 1.01f;

        System.out.println("Novo saldo com reajuste de 1%: " + fSaldo);

        teclado.close();
    }
}
