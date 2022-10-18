import java.util.Scanner;

public class Questao1Tester {

    public static void main(String[] args) {
        Questao1 questao1 = new Questao1();
        Scanner teclado = new Scanner(System.in);
        boolean bTemFila = true;

        do {
            mostraMenu();
            int iOpcao = Integer.parseInt(teclado.nextLine());

            switch (iOpcao) {
                case 1:
                    System.out.println(questao1.solicitaSenhaNormal());
                    break;

                case 2:
                    System.out.println(questao1.solicitaSenhaPreferencial());
                    break;

                case 3:
                    System.out.println(questao1.chamaProximo());
                    bTemFila = questao1.temFila();
                    break;

                default:
                    System.out.println("Opção Inválida, insira outra opção");
            }

        } while (bTemFila);

        teclado.close();
    }

    private static void mostraMenu() {
        System.out.println("\n1 - Solicitar senha Normal\n2 - Solicitar senha Prioridade");
        System.out.println("3 - Chamar próximo\nQual opção deseja?");
    }
}
