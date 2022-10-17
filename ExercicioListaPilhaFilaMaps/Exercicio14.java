import java.util.HashMap;
import java.util.LinkedList;

public class Exercicio14 {
    public HashMap<String, Integer> getMapa(LinkedList<String> keys, LinkedList<Integer> values) {
        HashMap<String, Integer> mapa = new HashMap<>();

        for (int idx = 0; idx < keys.size(); ++idx) { mapa.put(keys.get(idx), values.get(idx)); }

        return mapa;
    }
}
