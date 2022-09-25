public class Vetor {
    private int[] aVetor;
    private int iTamanho;

    public Vetor() {
        this.aVetor = new int[10];
        this.iTamanho = 0;
    }

    public void adicionaValor(int x) {
        if (iTamanho == this.aVetor.length) {
            int[] aNovoVetor = new int[this.iTamanho * 2];
            System.arraycopy(this.aVetor, 0, aNovoVetor, 0, this.iTamanho);

            this.aVetor = aNovoVetor;
        }

        this.aVetor[iTamanho] = x;
        ++iTamanho;
    }

    public String getVetor() {
        String sVetor = "";

        for (int i : this.aVetor)
            sVetor += i + "  ";

        return sVetor;
    }

    public int getSoma() {
        int iSoma = 0;

        for (int i : this.aVetor)
            iSoma += i;

        return iSoma;
    }

    public float getMedia() {
        return (float) getSoma() / this.iTamanho;
    }

    @Override
    public String toString() {
        String sRes = "";

        sRes = "Valores do vetor: ";
        sRes += getVetor();
        sRes += "\nSoma dos valores do vetor: " + getSoma() + "\nMedia dos valores do vetor: ";
        sRes += getMedia();
        sRes.formatted("%.2f");

        return sRes;
    }
}