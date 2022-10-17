import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Exercicio12 {
    LinkedList<Integer> L1 = new LinkedList<>();
    LinkedList<Integer> L2 = new LinkedList<>();
    Stack<Integer> P1 = new Stack<>();
    Stack<Integer> P2 = new Stack<>();
    LinkedList<Integer> L3 = new LinkedList<>();

    public void embaralha(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        L1.addAll(lista1);
        L2.addAll(lista2);

        Collections.shuffle(lista1);
        Collections.shuffle(lista2);

        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();

        pilha1.addAll(lista1);
        pilha2.addAll(lista2);

        P1.addAll(pilha1);
        P2.addAll(pilha2);

        do {
            if (!pilha1.isEmpty())
                L3.add(pilha1.pop());

            if (!pilha2.isEmpty())
                L3.add(pilha2.pop());
        } while (!pilha1.isEmpty() || !pilha2.isEmpty());
    }

    @Override
    public String toString() {
        String str = "Exercicio12\nL1:";

        for (Integer integer : L1) { str = str.concat(String.format("%d\n", integer)); }

        str = str.concat("\nL2:\n");

        for (Integer integer : L2) { str = str.concat(String.format("%d\n", integer)); }

        str = str.concat("\nP1:\n");

        for (Integer integer : P1) { str = str.concat(String.format("%d\n", integer)); }

        str = str.concat("\nP2:\n");

        for (Integer integer : P2) { str = str.concat(String.format("%d\n", integer)); }

        str = str.concat("\nL3:\n");

        for (Integer integer : L3) { str = str.concat(String.format("%d\n", integer)); }

        return str;
    }
}
