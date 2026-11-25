import java.util.Scanner;

public class ContarNumero {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        System.out.println("Dime un numero entero");
        int entero = sc.nextInt();
        // int suma = 0;

        // for (int i = entero; i >= 1; i--) {
        //     suma += i;
            
        // }

        // System.out.println("La suma total es " +suma); Estructura for 1ºInicio (int i = a lo que sea ), 2º Concidion, 3º Actualización

        for (int i = entero; i<=10; i++){
           int  multiplicacion = entero * i;
             System.out.println(multiplicacion);
        }
        

       sc.close(); 
    }
}
