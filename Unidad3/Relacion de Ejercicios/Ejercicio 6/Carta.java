
enum Palo {
    OROS, COPAS, ESPADAS, BASTOS
}

public class Carta {
    private int valor;
    private Palo palo;

    public Carta() {
        // Constructor por defecto
    }

    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta(Carta otraCarta) {
        this.valor = otraCarta.getValor();
        this.palo = otraCarta.getPalo();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public void imprimeCarta() {
        System.out.println(valor + " de " + palo);
    }
}
