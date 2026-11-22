package ActividadesExtra;

import java.util.Scanner;

public class Mulptiplos3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Multiplos de 3");
int num = sc.nextInt();

for (int i = 1; i <=20; i++){
   if (i % 3 == 0){
    System.out.println("El número " + i + " es múltiplo de 3");
   }
 else {
    System.out.println("El número " + i + " NO es múltiplo de 3");
}

sc.close();


}
    }
}