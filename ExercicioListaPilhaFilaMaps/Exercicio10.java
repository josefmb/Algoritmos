import java.util.Queue;

public class Exercicio10 {
    public Integer getQtdDesempilhar(Queue<Integer> queue, Integer iValue) {
        int res = -1;

        if (!queue.contains(iValue))
            return res;

        do {
            ++res;
        } while (queue.poll() != iValue);

        return res;
    }
}
