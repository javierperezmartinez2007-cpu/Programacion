import java.util.Scanner;

public class Actividad4 {
    public static void main(String[]args) {  
    Scanner scanner = new Scanner(System.in);
System.out.print("Introduce tu Opción (1 - True, 2 - False): ");//Lo hice de esta forma porque mas bonita y vistosa 
int Opción = scanner.nextInt();

if (Opción == 1) {
    System.out.println("||||||||||||");
    System.out.println ("||||||||||||");
    System.out.println("||||x|||||||||") ;
    System.out.println("||||0|x|||||||");
    System.out.println("|||x|0|x||||||");
    System.out.println("|x|0|x|0|x||||");
    System.out.println("--------------");
     System.out.println("0 1 2 3 4 5 6");

} else if (Opción == 2){
System.out.println("|x|0|x");
System.out.println("||0||");
System.out.println("||x||");
System.out.println("------");
System.out.println("0 1 2");

}
}
}