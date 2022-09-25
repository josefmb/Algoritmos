public class Exercicio2 {
    public static void main(String[] args) {
        float iPrimeiraMedia = (8 + 9 + 7) / 3.0f;
        float iSegundaMedia  = (4 + 5 + 6) / 3.0f;
        float iSomaMedias = iPrimeiraMedia + iSegundaMedia;
        float iMediaMedias = (iPrimeiraMedia + iSegundaMedia) / 2.0f;

        System.out.println("(8 + 9 + 7) / 3 = " + iPrimeiraMedia);
        System.out.println("(4 + 5 + 6) / 3 = " + iSegundaMedia );
        System.out.println(iPrimeiraMedia + " + " + iSegundaMedia + " = " + iSomaMedias);
        System.out.println("(" + iPrimeiraMedia + " + " + iSegundaMedia + ") / 2 = " + iMediaMedias);
    }
}
