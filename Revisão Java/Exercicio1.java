import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade em anos, meses e dias\nAnos: ");
        int iAnos = teclado.nextInt();

        System.out.println("Meses: ");
        int iMeses = teclado.nextInt();

        System.out.println("Dias: ");
        int iDias = teclado.nextInt();

        int iIdadeConvertida = ConverteIdadeEmDias(iAnos, iMeses, iDias);

        System.out.println("\nIdade Convertida em Dias: " + iIdadeConvertida);

        teclado.close();
    }

    public static int ConverteIdadeEmDias(int iAnos, int iMeses, int iDias) {
        int iRetorno = 0;

        iRetorno = iAnos * 365;
        iRetorno += iMeses * 30;
        iRetorno += iDias;
        
        return iRetorno;
    }
}
