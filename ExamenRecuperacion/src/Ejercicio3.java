import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Dime un numero ");
        int numero = sc.nextInt();
        int contador = 0;
        int minimoNegativo = Integer.MIN_VALUE;
        int SumaImpares = 0;
        int Enteros = 0;
        int Media = 0;

        while (numero != 0) {
            contador++;
            if (numero % 3 == 0 && numero % 5 == 0) {
              SumaImpares++;  
            } else {
                contador++;
            }
         Media = Enteros / minimoNegativo;
          System.out.println("Dime otro numero (0 para salir):");
    numero = sc.nextInt();
            
        }
        System.out.println("Numero introducidos: " +contador);
        System.out.println("La media de los enteros y del menor de los negativos es : " +Media);
        System.out.println("Suma de los impares multiplos de 3 y 5: " +SumaImpares);
        sc.close();
    }
}
