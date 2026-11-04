package ActividadesExtra;

import java.util.Scanner;

public class SumaDeNumeroPares {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Introduce un número límite: ");
int limite = sc.nextInt();
int sumaPares = 0;
for (int i = 1; i <= limite; i++) {
            
            // 2. Comprobamos si es par
            if (i % 2 == 0) {
                // 3. Usamos la variable existente 'sumaPares' sin poner 'int' delante
                sumaPares = sumaPares + i; 
            } else {
                System.out.println("El número " + i + " no es par");
            }
        }System.out.println("La suma total de los pares es: " + sumaPares);
        
        sc.close();
}
}