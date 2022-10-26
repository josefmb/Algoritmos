public class ListaTelefonica {
    private String m_sNome;
    private String m_sTelefone;
    private String m_sEmail;

    public ListaTelefonica(String sNome, String sTelefone, String sEmail) {
        this.m_sNome = sNome;
        this.m_sTelefone = sTelefone;
        this.m_sEmail = sEmail;
    }

    public void setNome(String sNome) { this.m_sNome = sNome; }
    public String getNome() { return this.m_sNome; }

    public void setTelefone(String sTelefone) { this.m_sTelefone = sTelefone; }
    public String getTelefone() { return this.m_sTelefone; }

    public void setEmail(String sEmail) { this.m_sEmail = sEmail; }
    public String getEmail() { return this.m_sEmail; }
}
