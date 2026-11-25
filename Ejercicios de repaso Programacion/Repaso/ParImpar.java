import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Dime tu edad y dime un numero entero");
        int edad = sc.nextInt();
        int numero = sc.nextInt();

        if (edad>=18){
            System.out.println("ERES MAYOR DE EDAD");
        } else {
            System.out.println("Eres menor de edad");
        }

        if (numero % 2  == 0){
            System.out.println("TU NUMERO ES PAR");
        } else {
            System.out.println("Tu numero no es par");
        }
        sc.close();
    }
}
