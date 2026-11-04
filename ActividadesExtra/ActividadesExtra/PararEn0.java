package ActividadesExtra;

import java.util.Scanner;

public class PararEn0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sumaTotal =0;
    System.out.print("Introduce un número (pulsa 0 para terminar): ");
        int numero = sc.nextInt();
    while (numero != 0) {
            
            // Sumamos el número introducido a nuestra variable acumuladora
            sumaTotal = sumaTotal + numero;
            
            // 3. NUEVA LECTURA: Volvemos a pedir el número DENTRO del bucle.
            // Si el usuario mete un 0, la próxima vez que el bucle compruebe 'numero != 0', 
            // dará falso y saldrá del bucle. Si mete otro número, continuará.
            System.out.print("Introduce otro número (0 para salir): ");
            numero = sc.nextInt();
        }
        
        // Fuera del bucle, mostramos el resultado total acumulado
        System.out.println("La suma de todos los números introducidos es: " + sumaTotal);
        
        sc.close();

}
}