package Ejercicio7;

import java.util.Random;

public class Lucha {
    public static void main(String[] args) {
        Random random = new Random();

        // Creamos el héroe y el monstruo con los valores que decidamos
        Heroe heroe = new Heroe("Arthur", 100, 22);
        Monstruo monstruo = new Monstruo("Orco", 110, 18);

        System.out.println("--- INICIO DEL COMBATE ---");
        heroe.mostrarInfo();
        monstruo.mostrarInfo();
        System.out.println();

        // Turno inicial aleatorio: 0 -> empieza el héroe, 1 -> empieza el monstruo
        int turno = random.nextInt(2);
        if (turno == 0) {
            System.out.println("Empieza atacando " + heroe.getNombre() + "!");
        } else {
            System.out.println("Empieza atacando " + monstruo.getNombre() + "!");
        }

        // Mientras ambos estén vivos (vida > 0)
        while (heroe.getVida() > 0 && monstruo.getVida() > 0) {
            if (turno == 0) {
                System.out.println(heroe.getNombre() + " ataca y hace " + heroe.getAtaque() + " de daño.");
                monstruo.recibirDaño(heroe.getAtaque());
                System.out.println("Vida restante de " + monstruo.getNombre() + ": " + monstruo.getVida());

                // Comprobamos si ha ganado el héroe
                if (monstruo.getVida() <= 0) {
                    break;
                }
                turno = 1; // Pasamos el turno al monstruo
            } else {
                System.out.println(monstruo.getNombre() + " ataca y hace " + monstruo.getAtaque() + " de daño.");
                heroe.recibirDaño(monstruo.getAtaque());
                System.out.println("Vida restante de " + heroe.getNombre() + ": " + heroe.getVida());

                // Comprobamos si ha ganado el monstruo
                if (heroe.getVida() <= 0) {
                    break;
                }
                turno = 0; // Pasamos el turno al héroe
            }
            System.out.println();
        }

        // Mostramos el ganador y su vida restante al acabar
        System.out.println("\n--- FIN DEL COMBATE ---");
        if (heroe.getVida() > 0) {
            System.out.println("Ganador: " + heroe.getNombre() + " | Vida restante: " + heroe.getVida());
        } else {
            System.out.println("Ganador: " + monstruo.getNombre() + " | Vida restante: " + monstruo.getVida());
        }
    }
}
