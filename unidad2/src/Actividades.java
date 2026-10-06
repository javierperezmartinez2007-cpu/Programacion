import java.util.Scanner;

public class Actividades {
    /**
     * @param args
     */
        public static void imprimir(String cadena,int variable){
        System.out.println(cadena + variable);
    }
    public static int suma(int a, int b){
        return a+b;
    }

    public static double suma(double a, double b){
        return a+b;
    }

    public static void actividad1(){
                //Actividad Diapositiva 9 Realiza un programa que genera 2 números y nos diga el cociente, la
// media, la potencia y la raíz cuadrada. Usa tipos adecuados
        
       // Generar dos números de manera aleartoria
        int min=1, max=10;
       int aleatorio1=(int)(Math.random()*(max-min+1)+min);
        double aleatorio2=(double)(Math.random()*(max-min+1)+min);

        // Realizar las operaciones
        System.out.println("Los números generados son: " + aleatorio1 + " y " + aleatorio2);
        System.out.println("La división es: " + (aleatorio1 / aleatorio2));
        System.out.println("La media es: " + ((aleatorio1 + aleatorio2) / 2.0));
        System.out.println("La potencia es: " + Math.pow(aleatorio1, aleatorio2));
        System.out.println("Las raices cuadradas son: " + Math.sqrt(aleatorio1) + " y " + Math.sqrt(aleatorio2)); 
    }

    public static void actividad2(){
         //Actividad de pedir dia mes y año y decir si es correcto o no y año bisiesto
   
         Scanner sc = new Scanner(System.in);
 int dia, mes, año;
 System.out.print("Introduce un día: ");
 dia = sc.nextInt();
 System.out.print("Introduce un mes: ");
 mes = sc.nextInt();
 System.out.print("Introduce un año: ");
 año = sc.nextInt(); 
    }

    public static void actividad3(){
//         int dia, mes, año;
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
    // }

}
public static int maximo(int valor1, int valor2){
    int maximo;
    if(valor1>= valor2){
        maximo = valor1;
    }else{
        maximo = valor2;
    }
    return maximo;
}
final static double PI = 3.14159265358979323846;
public static void areacilindro(double radio, double altura){
    double area = 2 * PI * radio * (radio + altura);
    System.out.println("El área del cilindro es: " + area);
}

public static void volumencilindro(double radio, double altura){
    double volumen = PI * Math.pow(radio, 2) * altura;
    System.out.println("El volumen del cilindro es: " + volumen);
}

public static void main(String[] args) {

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
// Scanner sc = new Scanner(System.in);
// System.out.println("Introduce un número para calcular su factorial: ");
// int numero=sc.nextInt();
// int producto=1;
// for(int i=numero; i>=1; i--)

// {
//     producto*=i;

//     System.out.println("El factorial de " + numero + " es: " + producto);

//     }

// Actividad edad y menor hasta -1
// int maximo=0 ,minimo=0, numero=0 ,contador=0; 
// int contadorMayores=0, suma=0, total=0;
// double media=0;
// Scanner sc = new Scanner(System.in);
// //Repetir hasta leer -1
// do{
//     System.out.println("Escribe la edad: ");
//     numero=sc.nextInt(); sc.nextLine();
//     if(contador==0){
//         maximo=numero;
//         minimo=numero;
//         contador++;
       
//     }
//     if(numero>maximo){
//         maximo=numero;
//     }
//     if((numero<minimo) && (numero != -1)) {
//         minimo = numero;
    
//     }
//     if(numero != -1) {
//         suma += numero;
//         total++;
//     }
//     suma+=numero;
//     total++;
//     if(numero>18){
//         contadorMayores++;
//     }
// } while (numero != -1);

// // imprimir el maximo y minimo
//     System.out.println("El número máximo es: " + maximo);
//     System.out.println("El número mínimo es: " + minimo);
//     System.out.println("La suma de las edades es: " + suma);
//     System.out.println("La media de las edades es: " +  (suma / (double) total));
//     System.out.println("El número de personas mayores de 18 años es: " + contadorMayores);
//     System.out.println("El número total de personas es: " + total);

//Actividad de adivinar un numero entre 1 y 100
// int intentos = 0; 
// int numeroUsuario;
// //numero maximo 100 minimo 1
// int max=100;
// int min=1;
// Scanner sc = new Scanner(System.in);
//  int numeroSecreto = (int) (Math.random() * 100) + 1;

//  //Hacer un bucle que se repita hasta que el usuario adivine el número secreto
// // System.out.println("El número secreto es: " + numeroSecreto);
// do{
//     System.out.println("Dime un número entre 1 y 100: ");
// numeroUsuario = sc.nextInt();
// if (numeroUsuario < numeroSecreto) {
//         System.out.println("El número secreto es mayor. Intenta de nuevo: ");
//     } else {
//         System.out.println("El número secreto es menor. Intenta de nuevo: ");
        
//     }
// }
// while (numeroUsuario != numeroSecreto);
//     System.out.println("El número secreto es: " + numeroSecreto);
//     System.out.println("Numeros de intentos: " + intentos);

//Actividades de programacion
//Actividad 1:Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora
// actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)

// int hora = java.time.LocalTime.now().getHour();
// if (hora >= 6 && hora <= 12) {
//     System.out.println("Buenos días");
// } else if (hora >= 13 && hora <= 20) {
//     System.out.println("Buenas tardes");
//     if (hora >= 21 || hora <= 5) {
//         System.out.println("Buenas noches");
//     }



// }

//Algoritmo MCD y MCM

// actividades clase 5: blucles anidados y funciones
// for (int i = 1; i <= 4; i++) {
//     if(i%2==0){//mostrar los pares
//     }
//     {for (int j = i; j <= 4; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
//     }
// }

// Actividadad de hacer tablas de multiplicar del 1 al 10
// for (int i = 1; i <= 10; i++) {
//     System.out.println("Tabla del " + i + ":");
//     for (int j = 1; j <= 10; j++) {
//         System.out.println(i + " x " + j + " = " + (i * j));
//     }
// }

// imprimir ("la suma de 3+5 es: ", suma(3,5));

System.out.println (maximo(3,5));
    areacilindro(3,5);
    volumencilindro(3,5);   
    }
  double radio = 3;
  double altura = 5;
}

