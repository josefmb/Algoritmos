import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercicio2 {
    private Queue<Integer> m_queue = new LinkedList<>(List.of(10, 2, 34, 42, 31, 12, 5, 99));

    public void orderQueue() {
        LinkedList<Integer> aList = new LinkedList<>(m_queue);
        aList.sort(null);

        // int size = m_queue.size();

        // while (aList.size() != size) {
        //     Integer orderValue = m_queue.element();

        //     for (Integer value : m_queue) {
        //         if (value < orderValue)
        //             orderValue = value;
        //     }

        //     aList.add(orderValue);
        //     m_queue.remove(orderValue);
        // }

        m_queue.clear();
        m_queue.addAll(aList);
    }

    @Override
    public String toString() {
        String str = "Exercicio2\nFila:\n";

        for (Integer value : m_queue) { str = str.concat(String.format("%d\n", value)); }

        return str;
    }
}
