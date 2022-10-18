import java.util.Scanner;

public class Questao3Tester {
    public static void main(String[] args) {
        Questao3 questao3 = new Questao3();
        Scanner teclado = new Scanner(System.in);

        int iOpcao = 0;

        do {
            System.out.println("Digite o código que deseja conferir ou -1 para sair");
            iOpcao = Integer.parseInt(teclado.nextLine());

            if (iOpcao == -1)
                break;
            else if (iOpcao > questao3.m_mapProdutos.size()) {
                System.out.println("Codigo não existe");
                continue;
            }

            System.out.println(questao3.getProdutoValor(iOpcao));
        } while (iOpcao != -1);

        teclado.close();
    }
}
