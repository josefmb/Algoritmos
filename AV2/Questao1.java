import java.util.LinkedList;
import java.util.Queue;

public class Questao1 {
    Queue<String> m_filaNormal       = new LinkedList<>();
    Queue<String> m_filaPreferencial = new LinkedList<>();

    int iQtdNormal       = 1;
    int iQtdPreferencial = 1;

    public String solicitaSenhaNormal() {
        String sSenhaAtual = "N";
        sSenhaAtual = sSenhaAtual.concat(String.format("%d", iQtdNormal));

        ++iQtdNormal;

        m_filaNormal.offer(sSenhaAtual);

        String sRes = String.format("Você recebeu a senha %s, aguarde ser chamado", sSenhaAtual);
        return sRes;
    }

    public String solicitaSenhaPreferencial() {
        String sSenhaAtual = "P";
        sSenhaAtual = sSenhaAtual.concat(String.format("%d", iQtdPreferencial));

        ++iQtdPreferencial;

        m_filaPreferencial.offer(sSenhaAtual);

        String sRes = String.format("Você recebeu a senha %s, aguarde ser chamado", sSenhaAtual);
        return sRes;
    }

    public String chamaProximo() {
        String sSenhaAtual = "";
        String sTipoSenha  = ""; 

        if (m_filaPreferencial.isEmpty()) {
            sSenhaAtual = m_filaNormal.poll();
            sTipoSenha  = "Normal";
        } else {
            sSenhaAtual = m_filaPreferencial.poll();
            sTipoSenha  = "Prioridade";
        }

        String sRes = String.format("Senha %s - %s, dirija-se para o atendimento", sTipoSenha, sSenhaAtual);
        return sRes;
    }

    public boolean temFila() { return !m_filaNormal.isEmpty() || !m_filaPreferencial.isEmpty(); }

}