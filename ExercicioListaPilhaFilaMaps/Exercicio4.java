import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercicio4 {
    Queue<Integer> m_qUm   = new LinkedList<>(List.of(1, 2, 3, 4, 5));
    Queue<Integer> m_qDois = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7));

    public boolean getFilaUmMaior() {
        Queue<Integer> m_qUmAux   = new LinkedList<>(m_qUm  );
        Queue<Integer> m_qDoisAux = new LinkedList<>(m_qDois);

        while (!m_qUmAux.isEmpty() && !m_qDoisAux.isEmpty()) {
            m_qUmAux  .remove();
            m_qDoisAux.remove();
        }

        return m_qUmAux.isEmpty() ? false : true;
    }

    @Override
    public String toString() {
        String str = String.format("Exercicio4\nFila # tem mais elementos que fila #");

        if (getFilaUmMaior()) {
            str = str.replaceFirst("#", "F1");
            str = str.replace("#", "F2");
        } else {
            str = str.replaceFirst("#", "F2");
            str = str.replace("#", "F1");
        }

        return str;
    }

}
