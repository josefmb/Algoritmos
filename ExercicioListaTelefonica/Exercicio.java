import java.util.HashMap;

public class Exercicio {
    private HashMap<Integer, ListaTelefonica> m_listaTelefonica = new HashMap<>();
    
    public void insereRegistro(ListaTelefonica lista) {
        Integer key = m_listaTelefonica.size() + 1;
        m_listaTelefonica.put(key, lista);
    }

    public void alteraRegistro(Integer key, ListaTelefonica novaLista) {
        m_listaTelefonica.put(key, novaLista);
    }

    public void excluiRegistro(Integer key) {
        m_listaTelefonica.remove(key);

        HashMap<Integer, ListaTelefonica> mapOrdenado = new HashMap<>();

        for (int idx = key; idx <= m_listaTelefonica.size(); ++idx) {
            ListaTelefonica listaTelefonica = m_listaTelefonica.get(idx + 1);
            mapOrdenado.put(idx, listaTelefonica);
            m_listaTelefonica.remove(idx + 1);
        }

        if (mapOrdenado.size() > 0)
            m_listaTelefonica.putAll(mapOrdenado);
    }

    @Override
    public String toString() {
        String sRes = "";
        ListaTelefonica lista;

        for (int idx = 1; idx <= m_listaTelefonica.size(); ++idx) {
            lista = m_listaTelefonica.get(idx);
            sRes = sRes.concat(String.format("%d. Lista Telefonica: %s - %s - %s\n", idx, lista.getNome(), lista.getTelefone(), lista.getEmail()));
        }

        return sRes;
    } 
}
