import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Informe um número: ");

        Scanner teclado = new Scanner(System.in);
        int iNumero = teclado.nextInt();

        System.out.println("Antecessor: " + (iNumero - 1) + "\nSucessor: " + (iNumero + 1));
        teclado.close();
    }
}
