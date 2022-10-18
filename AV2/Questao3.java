import java.util.HashMap;
import java.util.Map;

public class Questao3 {
    Map<Integer, String> m_mapProdutos = new HashMap<>(Map.of(
        1, "Batata",2, "Tomate",
        3, "Cebola",4, "Pimentão"
    ));

    Map<Integer, Double> m_mapValor = new HashMap<>(Map.of(
        1, 5.0, 2, 4.50, 3, 10.0, 4, 16.0
    ));

    public String getProdutoValor(Integer key) {
        String sProduto = m_mapProdutos.get(key);
        Double dValor = m_mapValor.get(key);

        String sRes = String.format("O valor do produto %s é %.2f", sProduto, dValor);
        return sRes;
    }
}
