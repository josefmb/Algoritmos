import java.util.HashMap;
import java.util.Map;

public class Exercicio13 {
    Map<Character, String> m_caracteres = new HashMap<>();

    public String getMensagemEncriptografada(String sMes) {
        preencherMap();
        sMes = sMes.toUpperCase();

        String str = "Exercicio13\n";

        for (int idx = 0; idx < sMes.length(); ++idx) {
            if (m_caracteres.containsKey(sMes.charAt(idx)))
                str = str.concat(m_caracteres.get(sMes.charAt(idx)));
            else
                str = str.concat("-");
        }

        return str;
    }

    private void preencherMap() {
        m_caracteres.put('A', "#");
        m_caracteres.put('B', "#");
        m_caracteres.put('C', "#");
        m_caracteres.put('D', "#");
        m_caracteres.put('E', "#");

        m_caracteres.put('F', "$");
        m_caracteres.put('G', "$");
        m_caracteres.put('H', "$");
        m_caracteres.put('I', "$");
        m_caracteres.put('J', "$");
        m_caracteres.put('K', "$");
        m_caracteres.put('L', "$");

        m_caracteres.put('M', "&");
        m_caracteres.put('N', "&");
        m_caracteres.put('O', "&");
        m_caracteres.put('P', "&");
        m_caracteres.put('Q', "&");
        m_caracteres.put('R', "&");

        m_caracteres.put('S', "*");
        m_caracteres.put('T', "*");
        m_caracteres.put('U', "*");
        m_caracteres.put('V', "*");
        m_caracteres.put('W', "*");
        m_caracteres.put('X', "*");
        m_caracteres.put('Y', "*");
        m_caracteres.put('Z', "*");
    }
}
