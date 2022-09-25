public class Baralho {
    Carta[] baralho = new Carta[56];

    public Baralho() {
        PreencheBaralho();
    }

    public void embaralha() {
        for (int i = 0; i < 10; ++i) {
            int iPosUm   = (int)(Math.random() * 56);
            int iPosDois = (int)(Math.random() * 56);

            Carta cartaUm = new Carta();
            Carta cartaDois = new Carta();

            cartaUm = this.baralho[iPosUm];
            cartaDois = this.baralho[iPosDois];
            this.baralho[iPosUm] = cartaDois;
            this.baralho[iPosDois] = cartaUm;
        }
    }

    public Carta daCarta() {
        return this.baralho[0];
    }

    public boolean temCarta() {
        if (this.baralho[0] == null)
            return false;
        else
            return true;
    }

    public void imprimeBaralho() {
        for (Carta carta : this.baralho)
            System.out.printf("\nNome: %s Naipe: %s", carta.getNome(), carta.getNaipe());
    }

    private void PreencheBaralho() {
        for (int i = 0; i < 56; ++i) {
            if (i < 4) {
                Carta carta = new Carta();
                carta.setNome("Coringa");
                carta.setNaipe("Coringa");

                this.baralho[i] = carta;
            }
            else if (i < 17)
                PreencheBaralhoNaipe(i, "Paus");
            else if (i < 30)
                PreencheBaralhoNaipe(i, "Copas");
            else if (i < 43)
                PreencheBaralhoNaipe(i, "Espadas");
            else
                PreencheBaralhoNaipe(i, "Ouro");
        }
    }

    private void PreencheBaralhoNaipe(int i, String naipe) {
        Carta carta = new Carta();

        switch (i) {
            case 4:
            case 17:
            case 30:
            case 43: {
                carta.setNome("As");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 5:
            case 18:
            case 31:
            case 44: {
                carta.setNome("2");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 6:
            case 19:
            case 32:
            case 45: {
                carta.setNome("3");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 7:
            case 20:
            case 33:
            case 46: {
                carta.setNome("4");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 8:
            case 21:
            case 34:
            case 47: {
                carta.setNome("5");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 9:
            case 22:
            case 35:
            case 48: {
                carta.setNome("6");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 10:
            case 23:
            case 36:
            case 49: {
                carta.setNome("7");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 11:
            case 24:
            case 37:
            case 50: {
                carta.setNome("8");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 12:
            case 25:
            case 38:
            case 51: {
                carta.setNome("9");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 13:
            case 26:
            case 39:
            case 52: {
                carta.setNome("10");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 14:
            case 27:
            case 40:
            case 53: {
                carta.setNome("Valete");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 15:
            case 28:
            case 41:
            case 54: {
                carta.setNome("Dama");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;

            case 16:
            case 29:
            case 42:
            case 55: {
                carta.setNome("Rei");
                carta.setNaipe(naipe);

                this.baralho[i] = carta;
            }
            break;
        }
    }
}
