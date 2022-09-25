public class VetorTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
			Vetor aVetor = new Vetor();

			for (int j = 0; j < 20; ++j)
				aVetor.adicionaValor((j + 1) * (int)(Math.random() * 10));

            String sRes = aVetor.toString();
			System.out.println(sRes);
		}
    }
}
