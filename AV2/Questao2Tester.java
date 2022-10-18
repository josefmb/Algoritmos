import java.util.Scanner;

public class Questao2Tester {
    static Questao2 questao2 = new Questao2();
    static boolean bEhJogadorUm = true;

    public static void main(String[] args) {
        questao2.inicializaJogo();
        boolean bContinua = true;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo ao Ouro contra Espada.");
        System.out.println("Este jogo contem 21 cartas, ganha quem tirar Ouro1 ou Espada5. E perde também se retirar a Carta Coringa!");
        System.out.println("Tente a sorte");
        System.out.println("---------------");

        String sCarta = "";
        int iJogador = 0;

        do {
            mostraMenu();

            iJogador = bEhJogadorUm ? 1 : 2;
            System.out.printf("Jogador %d - Deseja retirar a carta? (1 - Sim / 2 - Sair do Jogo)\n", iJogador);

            int iOpcao = Integer.parseInt(teclado.nextLine());

            switch (iOpcao) {
                case 1:
                    sCarta = questao2.getCarta();
                    break;
                
                case 2:
                    return;

                default:
                    System.out.println("Opção inválida, tente outra");
            }

            System.out.printf("A carta retirada foi %s\n", sCarta);

            if (questao2.verificaSeGanhou(sCarta)) {
                System.out.printf("Parabéns Jogador %d você venceu com a carta %s\n", iJogador, sCarta);

                bContinua = false;
                break;
            } else if (questao2.verificaSeEhCoringa(sCarta)) {
                System.out.printf("Que pena Jogador %d, você perdeu\n", iJogador);

                bContinua = false;
                break;
            }

            bEhJogadorUm = bEhJogadorUm ? false : true;

        } while (bContinua);

        teclado.close();
    }

    public static void mostraMenu() {
        String sMenu = String.format("Cartas no baralho (%d, %d de Ouro, %d de Espada, %d Coringa", 
        questao2.m_baralho.size(), questao2.getQtdNaipe("Ouro"),
        questao2.getQtdNaipe("Espada"), questao2.getQtdNaipe("Coringa"));

        int iJogador = bEhJogadorUm ? 1 : 2;
        sMenu = sMenu.concat(String.format("Jogador %d - Deseja retirar a carta? (1 - Sim / 2 - Sair do Jogo)", iJogador));
    }
}
