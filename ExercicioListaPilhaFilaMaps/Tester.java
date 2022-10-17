import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Tester {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        exercicio1.setPilha();

        System.out.println(exercicio1.toString());

        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.orderQueue();

        System.out.println(exercicio2.toString());

        Exercicio3 exercicio3 = new Exercicio3();
        exercicio3.calculaMaiorMenorMedia();

        System.out.println(exercicio3.toString());

        Exercicio4 exercicio4 = new Exercicio4();
        System.out.println(exercicio4.toString());

        Exercicio5 exercicio5 = new Exercicio5();

        Queue<Integer> qUm   = new LinkedList<>(List.of(1, 2, 3, 4, 5, 8      ));
        Queue<Integer> qDois = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        exercicio5.ordenaFila(qUm, qDois);

        System.out.println(exercicio5.toString());

        Exercicio6 exercicio6 = new Exercicio6();

        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 8));
        exercicio6.setStackQueue(list);

        System.out.println(exercicio6.toString());

        Exercicio7 exercicio7 = new Exercicio7();
        Integer num = exercicio7.getFirstElement(qUm);
        System.out.printf("Exercicio7\nPrimeiro elemento da fila: %d\n\n", num);

        Exercicio8 exercicio8 = new Exercicio8();
        num = exercicio8.getQtdImpares(qDois);
        System.out.printf("Exercicio8\nQuantidade de elementos impares da fila: %d\n\n", num);

        Exercicio10 exercicio10 = new Exercicio10();
        num = exercicio10.getQtdDesempilhar(qUm, 1);
        System.out.printf("Exercicio10\nQuantidade a desempilhar: %d\n", num);
        num = exercicio10.getQtdDesempilhar(qUm, 4);
        System.out.printf("Quantidade a desempilhar: %d\n\n", num);

        Questao11 questao11 = new Questao11();
        num = questao11.getMaiorPar(qDois);
        System.out.printf("Exercicio11\nMaior numero par da fila: %d\n", num);

        String str = "";
        for (Integer integer : qDois) { str = str.concat(String.format("%d\n", integer)); }
        System.out.println(str);

        Exercicio12 exercicio12 = new Exercicio12();

        LinkedList<Integer> listDois = new LinkedList<>(List.of(12, 13, 18, 43, 24, 99, 97, 66));
        exercicio12.embaralha(list, listDois);

        System.out.println(exercicio12.toString());

        Exercicio13 exercicio13 = new Exercicio13();
        str = exercicio13.getMensagemEncriptografada("Camila Eu te Amo s2!");
        System.out.println(str);

        Exercicio14 exercicio14 = new Exercicio14();
        LinkedList<String> chaves = new LinkedList<>(List.of("A", "B", "C", "D"));
        LinkedList<Integer> valores = new LinkedList<>(List.of(10, 20, 30, 6));

        HashMap<String, Integer> mapa = exercicio14.getMapa(chaves, valores);
        Integer valor = 0;

        System.out.println("\nExercicio14");

        for (Integer value : valores) {
            str = mapa.entrySet()
                      .stream()
                      .filter(e -> e.getValue().equals(value))
                      .findFirst()
                      .map(Map.Entry::getKey)
                      .orElse(null);
            
            System.out.print("Chave: " + str);

            valor = mapa.get(str);
            System.out.printf(" Valor: %d\n", valor);
        }
    }   
}
