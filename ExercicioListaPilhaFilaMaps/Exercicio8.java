import java.util.Queue;

public class Exercicio8 {
    public Integer getQtdImpares(Queue<Integer> queue) {
        int res = 0;

        for (Integer integer : queue) {
            if (integer % 2 != 0)
                ++res;
        }

        return res;
    }
}
