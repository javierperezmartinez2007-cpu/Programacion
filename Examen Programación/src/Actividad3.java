import java.util.Scanner;

public class Actividad3 {
     public static void main(String[]args) {  
    Scanner scanner = new Scanner(System.in);

int numero = 0;
int positivo = 0;
int negativo = 0; 
int contadorTotal = 0;
double sumaImpares= 0;
int Contadorimpares = 0;
int ContadorPares = 0;
int NumerosPares = 0;
int NumerosImpares = 0;
// Aqui quiero darle condiciones al programa para que cada vez que vea un numero par o impar sepa que hacer 
System.out.println("Introduce un numero");
do {
    numero = scanner.nextInt();
    if (numero != 0){
    contadorTotal++;
    
}
if (numero > 0){
    positivo++;
}else {
    negativo++;
}
if (numero % 2 == 0) {

    ContadorPares++;
}else {

    Contadorimpares++;
}
}while (numero != 0);

System.out.println("La suma de los impares es: " +Contadorimpares);

}
}