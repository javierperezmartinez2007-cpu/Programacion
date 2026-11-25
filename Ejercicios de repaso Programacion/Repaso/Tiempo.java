import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuantos grados hace hoy en tu localidad.");
        double grados = sc.nextDouble();

        System.out.println("¿Esta lloviedo?");
        String lluvia = sc.next();
        boolean repuesta = lluvia.equalsIgnoreCase("s");

        if (grados>25 && repuesta == false) {
            System.out.println("Es buen dia para ir con camiseta corta");
        }
       else if (grados<10 || repuesta == true) {
            System.out.println("Lleva abrigo y paraguas");
       } else {
        System.out.println("Dia normal ve como quiersas");
       }
      sc.close();

    }
}

