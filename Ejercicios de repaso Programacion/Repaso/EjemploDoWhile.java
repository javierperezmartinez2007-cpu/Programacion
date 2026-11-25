import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) { //Se usa cuando quieres pedir algo al menos una vez y repetir mientras el dato no sea válido
        Scanner sc = new Scanner(System.in);
int nota;

do {
    System.out.print("Introduce una nota entre 0 y 10: ");
    nota = sc.nextInt();
} while (nota < 0 || nota > 10);

System.out.println("Nota valida: " + nota);
    sc.close();
    }

}
