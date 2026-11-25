import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime precios de productos");
        int productos = sc.nextInt();
        int contador = 0;
        double suma = 0;
        while (productos != 0) {
            contador++;
            suma += productos;

            System.out.println("Dime otro precio (0 para terminar):");
             productos = sc.nextInt();

        } 
        double total = suma;

if (total > 100) {
    double descuento = total * 0.15;
    total = total - descuento;
}

System.out.println("Productos comprados: " + contador);
System.out.println("Importe sin descuento: " + suma);
System.out.println("Total a pagar: " + total);

sc.close();
        
        
    }
}
