import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercicio3 {
    LinkedList<Integer> m_list = new LinkedList<>(List.of(10, 2, 3, 19, 67, 44, 52, 91, 99, 101));
    List<Double> m_res = new ArrayList<>();

    public void calculaMaiorMenorMedia() {
        double dMaior = Collections.max(m_list);
        double dMenor = Collections.min(m_list);
        double dMedia = m_list.stream().mapToDouble(Double::valueOf).sum() / m_list.size();

        m_res = Arrays.asList(dMaior, dMenor, dMedia);
    }

    @Override
    public String toString() {
        String str = "Exercicio3\nMaior número: ";
        str = str.concat(String.format(
            "%.2f\nMenor número: %.2f\nMédia Aritmética: %.2f\n"
            , m_res.get(0)
            , m_res.get(1)
            , m_res.get(2)
        ));

        return str;
    }
}
