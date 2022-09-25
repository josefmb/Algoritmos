import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a porcentagem do IPI: ");
        float fIPI = teclado.nextFloat();

        System.out.println("Informe o codigo da Peca 1: ");
        String sCodicoPeca1 = teclado.next();

        System.out.println("Informe o valor unitario da Peca 1: ");
        float fValorUnitarioPeca1 = teclado.nextFloat();

        System.out.println("Informe a quantidade da Peca 1: ");
        int iQtdPeca1 = teclado.nextInt();

        System.out.println("Informe o codigo da Peca 2: ");
        String sCodicoPeca2 = teclado.next();

        System.out.println("Informe o valor unitario da Peca 2: ");
        float fValorUnitarioPeca2 = teclado.nextFloat();

        System.out.println("Informe a quantidade da Peca 2: ");
        int iQtdPeca2 = teclado.nextInt();

        float fValorFinal = (fValorUnitarioPeca1 * iQtdPeca1 + fValorUnitarioPeca2 * iQtdPeca2) * (fIPI / 100 + 1);
        System.out.println("Valor total a ser pago: " + fValorFinal);

        teclado.close();
    }
}
