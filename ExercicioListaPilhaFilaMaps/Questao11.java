import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Questao11 {
    public Integer getMaiorPar(Queue<Integer> queue) {
        Queue<Integer> aux = new LinkedList<>(queue);
        aux.removeIf(t -> t % 2 != 0);

        if (aux.isEmpty())
            return 0;

        return Collections.max(aux);
    }
}
