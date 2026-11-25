import java.util.Scanner;

public class ContarMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero entero");
        int entero = sc.nextInt();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;

        while (entero != -1) {
            contador++;
        
    if (entero>maximo) {
        maximo = entero;
    } 
        System.out.println("Dime otro numero (-1 para salir):");
    entero = sc.nextInt();
    }

    if (contador > 0){
        System.out.println("Has introducido " + contador + " numeros.");
    System.out.println("El numero mas alto ha sido: " + maximo);
    } else {
    System.out.println("No has introducido ningun numero.");
    }
sc.close();
 
    }
}