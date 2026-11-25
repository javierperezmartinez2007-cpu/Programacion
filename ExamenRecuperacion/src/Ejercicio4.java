import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
 System.out.println("Introduce tu Opción: (True o False)");
   String opcion = sc.next();
   boolean respuesta = opcion.equalsIgnoreCase("True");

if (respuesta == true ) {
    System.out.println("||||||||||||");
    System.out.println ("||||||||||||");
    System.out.println("||||x|||||||||") ;
    System.out.println("||||0|x|||||||");
    System.out.println("|||x|0|x||||||");
    System.out.println("|x|0|x|0|x||||");
    System.out.println("--------------");
     System.out.println("0 1 2 3 4 5 6");

} else if (respuesta == false){
System.out.println("|x|0|x");
System.out.println("| |0| |");
System.out.println("| |x| |");
System.out.println("------");
System.out.println("0 1 2");
}
sc.close();
}
}