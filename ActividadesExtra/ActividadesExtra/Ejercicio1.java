package ActividadesExtra;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.err.println("Introduce los kwh consumidos: ");

double kwh = sc.nextDouble();

double costeConsumo = 0;
double cuotaFija = 12.0;

// Calcular segun los tramos 
if (kwh <= 100){
    costeConsumo = kwh * 100;
}
else if (kwh <= 300){
    costeConsumo = ( 100*0.15) + ((kwh - 100) * 0.20);
}
else {
    costeConsumo = (100*0.15) + ( 200*0.20) + ((kwh - 300)*0.30);
}

//Calcular el total sumando la cuota fija
double totalPagar = costeConsumo + cuotaFija;
 
System.out.printf("Coste por consumo: %.2f €\n", costeConsumo);
        System.out.printf("Cuota de mantenimiento: %.2f €\n", cuotaFija);
        System.out.printf("TOTAL A PAGAR: %.2f €\n", totalPagar);
        
        sc.close();





}
} 