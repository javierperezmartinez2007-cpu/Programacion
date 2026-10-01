import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        //Actividad Diapositiva 9 Realiza un programa que genera 2 números y nos diga el cociente, la
// media, la potencia y la raíz cuadrada. Usa tipos adecuados
        
       // Generar dos números de manera aleartoria
    //    int min=1, max=10;
    //    int aleatorio1=(int)(Math.random()*(max-min+1)+min);
    //    double aleatorio2=(double)(Math.random()*(max-min+1)+min);

    //    // Realizar las operaciones
    //    System.out.println("Los números generados son: " + aleatorio1 + " y " + aleatorio2);
    //    System.out.println("La división es: " + (aleatorio1 / aleatorio2));
    //    System.out.println("La media es: " + ((aleatorio1 + aleatorio2) / 2.0));
    //     System.out.println("La potencia es: " + Math.pow(aleatorio1, aleatorio2));
    //     System.out.println("Las raices cuadradas son: " + Math.sqrt(aleatorio1) + " y " + Math.sqrt(aleatorio2)); 
   
    //Actividad de pedir dia mes y año y decir si es correcto o no y año bisiesto
//    int dia, mes, año;
//    System.out.println("Introduce un día: ");
//    try (Scanner sc = new Scanner(System.in)) {
//     dia = sc.nextInt();
//     System.out.println("Introduce un mes: ");
//     mes = sc.nextInt();
//     System.out.println("Introduce un año: ");
//     año = sc.nextInt();
//     //año bisiesto
//     boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
//      System.out.println("El año " + año + (bisiesto ? " es bisiesto." : " no es bisiesto."));
//     if ((mes < 1 || mes > 12) || (dia < 1 || dia > 31)) {
//         System.out.println("La fecha introducida no es correcta.");
//     } else {
//         System.out.println("La fecha introducida es incorecta.");
//     }
   


//Correccion (corregirla)
// Scanner sc = new Scanner(System.in);
// int dia, mes, año;
// System.out.print("Introduce un día: ");
// dia = sc.nextInt();
// System.out.print("Introduce un mes: ");
// mes = sc.nextInt();
// System.out.print("Introduce un año: ");
// año = sc.nextInt(); 

// if(dia>0 && dia<=31 && mes>0 && mes<=12 && año>0){
//     if(dia==29 && mes==2){//Comprobar si el año es bisiesto
//         boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
//         if(!bisiesto){
//             System.out.println("La fecha introducida es correcta.");
//             return;
//             else{
//                 System.out.println("La fecha introducida es correcta.");
//             }
//         }
//     }

//     else if(dia>30 && (mes==4 || mes==6 || mes==9 || mes==11)){
//         System.out.println("La fecha introducida no es correcta.");
//         return;
//     }
    

//Actividad de bucles del multiplos de 2 y 3 entre 50 y 200
// for (int i = 50; i <= 200; i++) {
//     if (i % 2 == 0 && i % 3 == 0) {
//         System.out.println(i + " es múltiplo de 2 y de 3.");
     
// }

    
//     }

//Actividad Desarrolla un programa que calcule el factorrial del numero introducido
Scanner sc = new Scanner(System.in);
System.out.println("Introduce un número para calcular su factorial: ");
int numero=sc.nextInt();
int producto=1;
for(int i=numero; i>=1; i--)

{
    producto*=i;

    System.out.println("El factorial de " + numero + " es: " + producto);

    }
}
}
