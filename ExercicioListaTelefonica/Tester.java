import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int iOpcao = 0;

        Exercicio exercicio = new Exercicio();

        do {
            System.out.println("0. Sair\n1. Cadastrar\n2. Editar\n3. Excluir\n4. Ver Lista");
            iOpcao = Integer.parseInt(teclado.nextLine());

            switch (iOpcao) {

                case 0:
                    continue;

                case 1:
                {
                    System.out.println("Insira o nome:");
                    String sNome = teclado.nextLine();

                    System.out.println("Insira o telefone:");
                    String sTelefone = teclado.nextLine();

                    System.out.println("Insira o e-mail:");
                    String sEmail = teclado.nextLine();

                    ListaTelefonica lista = new ListaTelefonica(sNome, sTelefone, sEmail);
                    exercicio.insereRegistro(lista);
                }
                break;

                case 2:
                {
                    System.out.println(exercicio.toString() + "\nEscolha um registro para edição:");
                    int key = Integer.parseInt(teclado.nextLine());

                    System.out.println("Insira o novo nome:");
                    String sNome = teclado.nextLine();

                    System.out.println("Insira o novo telefone:");
                    String sTelefone = teclado.nextLine();

                    System.out.println("Insira o novo e-mail:");
                    String sEmail = teclado.nextLine();

                    ListaTelefonica lista = new ListaTelefonica(sNome, sTelefone, sEmail);
                    exercicio.alteraRegistro(key, lista);
                }
                break;

                case 3:
                {
                    System.out.println(exercicio.toString() + "\nEscolha um registro para remoção:");
                    int key = Integer.parseInt(teclado.nextLine());

                    System.out.printf("Tem certeza que deseja excluir o registro de número %d?(1 - Sim | 2 - Não)\n", key);
                    int iResposta = Integer.parseInt(teclado.nextLine());

                    if (iResposta == 1)
                        exercicio.excluiRegistro(key);
                }
                break;

                case 4:
                {
                    System.out.println(exercicio.toString());
                }
                break;

                default:
                {
                    System.out.println("Opção inválida!");
                }
            }
        } while (iOpcao != 0);

        teclado.close();

    }
}
