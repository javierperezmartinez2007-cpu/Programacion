import java.util.Scanner;

public class Actividad5 {
      public static void main(String[]args) {  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Dime un numero positivo");
int numero = scanner.nextInt();
int Contarpositivos = 0;
do {
    numero = scanner.nextInt();
if (numero < 0) {
    Contarpositivos++;
} }while (numero != 0); 
  
//Aqui quiero ponerle la condicion pare que cuando sea negativo salte el aviso al poner el numero negativo y que el usuario no pueda continuar 
try{
    
      boolean resultado = numero < 0; 
}catch (ArithmeticException e) {
 System.out.println("Este numero no es positivo ");
}
}
}