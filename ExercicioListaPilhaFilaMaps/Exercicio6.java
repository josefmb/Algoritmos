import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio6 {
    LinkedList<Integer> m_list = new LinkedList<>();
    Queue<Integer> m_queue     = new LinkedList<>();
    Stack<Integer> m_stack     = new Stack     <>();

    public void setStackQueue(LinkedList<Integer> list) {
        m_queue.addAll(list);
        m_stack.addAll(list);

        m_list.addAll(list);
    }

    @Override
    public String toString() {
        String str = "Exercicio6\nLista:\n";

        for (Integer value : m_list)
            str = str.concat(String.format("%d\n", value));

        str = str.concat("\nFila:\n");

        for (Integer value : m_queue)
            str = str.concat(String.format("%d\n", value));

        str = str.concat("\nPilha:\n");

        for (Integer value : m_stack)
            str = str.concat(String.format("%d\n", value));

        return str;
    }
}
