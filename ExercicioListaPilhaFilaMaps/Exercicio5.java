import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exercicio5 {
    Queue<Integer> m_qTres = new LinkedList<>();

    public void ordenaFila(Queue<Integer> qUm, Queue<Integer> qDois) {
        Set<Integer> setNumbers = new HashSet<>();

        setNumbers.addAll(qUm);
        setNumbers.addAll(qDois);

        m_qTres.addAll(setNumbers);
    }

    @Override
    public String toString() {
        String str = "Exercicio5\nFila:\n";

        for (Integer value : m_qTres)
            str = str.concat(String.format("%d\n", value));

        return str;
    }

}
