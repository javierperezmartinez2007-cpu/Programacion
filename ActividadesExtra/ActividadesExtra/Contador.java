package ActividadesExtra;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
    //Multiplicar del 1 al 10
    Scanner sc = new Scanner(System.in);
    System.err.println("Dime un numero entero");
    int num = sc.nextInt();
for (int i = 1; i <= 10; i++){
  int multiplicacion= num * i;
  System.out.println(num + " x " +i+ " = " + multiplicacion );
  
}
sc.close();
}
}  