import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Exercicio1 {
    private Stack<Integer> m_stack = new Stack<>();
    private Queue<Integer> m_queue = new LinkedList<>(List.of(1, 2, 3, 4));

    public void setPilha() {
        m_queue.forEach(value -> {
            m_stack.push(value);
            m_stack.push(value * 2);
        });
    }

    @Override
    public String toString() {
        String str = "Exercicio1\nFila:\n";

        int size = m_queue.size();
        for (int idx = 0; idx < size; ++idx) {
            str = str.concat(String.format("%d\n", m_queue.poll()));
        }

        str = str.concat("\nPilha:\n");
        for (int idx = 0; idx < m_stack.size(); ++idx) {
            str = str.concat(String.format("%d\n", m_stack.elementAt(idx)));
        }

        return str;
    } 
}