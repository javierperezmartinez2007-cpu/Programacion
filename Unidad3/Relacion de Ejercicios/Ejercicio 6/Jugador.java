

public class Jugador {
    private String nombre;
    private Carta carta;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.carta = null;
    }

    public Jugador(String nombre, Carta carta) {
        this.nombre = nombre;
        this.carta = carta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public void imprimeJugador() {
        System.out.print("Jugador: " + nombre + " -> ");
        if (carta != null) {
            carta.imprimeCarta();
        } else {
            System.out.println("Sin carta");
        }
    }
}
