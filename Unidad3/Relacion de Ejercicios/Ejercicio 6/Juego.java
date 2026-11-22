
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Juego {
    private int ganadas1;
    private int ganadas2;

    public Juego() {
        this.ganadas1 = 0;
        this.ganadas2 = 0;
    }
    public Juego(int ganadas1, int ganadas2) {
        this.ganadas1 = ganadas1;
        this.ganadas2 = ganadas2;
    }

    // Genera una carta aleatoria (valor entre 1 y 12 y un palo aleatorio)
    private Carta generarCartaAleatoria(Random random) {
        int valor = random.nextInt(12) + 1; // Entre 1 y 12
        Palo[] palos = Palo.values();
        Palo paloAleatorio = palos[random.nextInt(palos.length)];
        return new Carta(valor, paloAleatorio);
    }

    // Guarda el resultado final en el fichero usando append (true)
    private void guardarHistorico() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("historico_partidas.txt", true))) {
            bw.write("Resultado final -> Jugador 1: " + ganadas1 + " | Jugador 2: " + ganadas2);
            bw.newLine();
            System.out.println("Resultado guardado en historico_partidas.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el histórico: " + e.getMessage());
        }
    }

    public void cartaAlta() {
        Random random = new Random();
        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");

        int ronda = 1;

        // El juego termina cuando uno de los jugadores llega a 3 victorias
        while (ganadas1 < 3 && ganadas2 < 3) {
            System.out.println("\n--- Ronda " + ronda + " ---");

            // Asignamos una carta aleatoria a cada jugador
            j1.setCarta(generarCartaAleatoria(random));
            j2.setCarta(generarCartaAleatoria(random));

            // Mostramos las cartas de cada jugador
            j1.imprimeJugador();
            j2.imprimeJugador();

            // Comprobamos quién gana la ronda (gana la carta mayor)
            if (j1.getCarta().getValor() > j2.getCarta().getValor()) {
                ganadas1++;
                System.out.println("Gana la ronda " + j1.getNombre());
            } else if (j2.getCarta().getValor() > j1.getCarta().getValor()) {
                ganadas2++;
                System.out.println("Gana la ronda " + j2.getNombre());
            } else {
                System.out.println("Empate en esta ronda");
            }

            System.out.println("Marcador -> Jugador 1: " + ganadas1 + " | Jugador 2: " + ganadas2);
            ronda++;
        }

        System.out.println("\n¡Fin de la partida!");
        if (ganadas1 == 3) {
            System.out.println("¡Ha ganado el Jugador 1!");
        } else {
            System.out.println("¡Ha ganado el Jugador 2!");
        }

        // Guardamos el histórico al terminar
        guardarHistorico();
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.cartaAlta();
    }
}
