import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Questao2 {
    LinkedList<String> m_cartasOuro = new LinkedList<>(List.of(
        "Ouro1", "Ouro2", "Ouro3", "Ouro4", "Ouro5",
        "Ouro6", "Ouro7", "Ouro8", "Ouro9", "Ouro10"
    ));

    LinkedList<String> m_cartasEspada = new LinkedList<>(List.of(
        "Espada1", "Espada2", "Espada3", "Espada4", "Espada5",
        "Espada6", "Espada7", "Espada8", "Espada9", "Espada10"
    ));

    LinkedList<String> m_baralho = new LinkedList<>();

    Stack<String> m_pilhaCartas = new Stack<>();

    private void inicializaBaralho() {
        m_baralho.addAll(m_cartasOuro);
        m_baralho.add("Coringa");
        m_baralho.addAll(m_cartasEspada);
        Collections.shuffle(m_baralho);
    } 

    public void inicializaJogo() {
        inicializaBaralho();
        m_pilhaCartas.addAll(m_baralho);   
    }

    public String getCarta() { return m_pilhaCartas.pop(); }

    public int getQtdNaipe(String sNaipe) {
        int iQtd = 0;

        for (String carta : m_baralho) {
            if (carta.startsWith(sNaipe))
                ++iQtd;
        }

        return iQtd;
    }

    public boolean verificaSeGanhou(String sCarta) {
        if (sCarta.equals("Ouro1") || sCarta.equals("Espada5"))
            return true;

        return false;
    }

    public boolean verificaSeEhCoringa(String sCarta) {
        if (sCarta.equals("Coringa"))
            return true;
        
        return false;
    }
}
