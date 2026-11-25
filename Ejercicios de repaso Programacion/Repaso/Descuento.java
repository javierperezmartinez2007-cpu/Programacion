import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el precio del procucto");
    double precio = sc.nextDouble();

    System.out.println("¿tienes carnet?");
    String  respuesta = sc.next();
    boolean carnet = respuesta.equalsIgnoreCase("s");
    
    if (precio >= 50 || carnet ) {
        double descuento;
        descuento = precio * 0.10;
        double precioFinal = precio - descuento;
        System.out.println("Tienes un descuento del 10% " +precioFinal);
    } else {
        System.out.println("Lo siento no tienes descuento");
    }

    sc.close();
}
}