import java.util.Scanner;

public class Relacionejercicios {

public static void Ejercicio1(){ //Actividad 1 (Buenos dias, Buenas tardes, Buenas noches)
int hora = 0;
    if (hora >= 6 && hora <= 12) {
    System.out.println("Buenos días");
} else if (hora >= 13 && hora <= 20) {
    System.out.println("Buenas tardes");
    if (hora >= 21 || hora <= 5) {
        System.out.println("Buenas noches");
    }
}
}

public static void Ejercicio2(){//  Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
// horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se
// pagan a 16 euros la hora
    Scanner scanner = new Scanner(System.in);

//Pido el horario del trabajador 
System.out.print("Añade las horas trabajadas");
int horastrabajadas = scanner.nextInt();
int salariototal;

//Calculo segun las horas
if (horastrabajadas <= 40) {
    salariototal = horastrabajadas * 12;
}
 else {
    int horasExtras = horastrabajadas - 40;
    salariototal = (40*12) + (horasExtras * 16);
}
 
//Mostras resultado 
System.out.println("El suedo de esta semana es " +salariototal+ " euros");
}
   
public static void Ejercicio3(){ //Ejercicio signo del zodiaco
    Scanner scanner = new Scanner(System.in);

//Pido dia y mes del año 
System.out.println("añade dia y mes de tu cumpleaños");
int dia = scanner.nextInt();
int mes = scanner.nextInt();
String signo = "";

//Que diga el signo del zodiaco dende del dia y el mes (utilizo el swich ya que son muchas condiciones)
switch (mes) {
    case 1: //Enero
        if (dia <= 20) {
            signo = "Capricornio";
            }
        else {
            signo = "Acuario";
        }
        break;
    case 2: //Febrero
        if (dia <= 19) {
            signo = "Acuario";
        }
        else {
            signo = "Piscis";
        }  
    case 3: //Marzo
        if (dia <= 21) {
            signo = "Piscis";
        }
        else {
            signo = "Aries";
        }
    case 4: //Abril
        if (dia <= 20) {
            signo = "Aries";
        }
        else{
            signo = "Tauro";
        }
    case 5: //Mayo
        if( dia <= 21) {
            signo = "Tauro";
        }
        else {
            signo = "Géminis";
        }
    case 6: //Junio
        if (dia <= 23) {
            signo = "Géminis";
        }
        else {
            signo = "Cancer";
        }
    case 7: //Julio
        if (dia <= 23){
            signo = "Cancer";
        }
        else {
            signo = "Leo";
        }
    case 8: //Agosto
        if (dia <= 23) {
            signo = "Leo";
        } 
        else {
            signo = "Virgo";
        }
    case 9: //Septiembre
        if (dia <= 23) {
            signo = "Virgo";
        }
        else {
            signo = "Libra";
        }
    case 10:
        if (dia <= 23) {
            signo = "Libra";
        }
        else {
            signo = "Escorpio";
        }
    case 11:
        if(dia <= 22){
            signo = "Escorpio";
        }
        else {
            signo = "Sagitario";
        }
    case 12:
        if (dia <= 22) {
            signo = "Sagitario";
        }
        else {
            signo = "Capricornio";
        }
        break;
    default:
        signo = "desconocido (el mes introducido no es válido)";
        break;
            
    }
   System.out.println("Tu signo del zodiaco es " + signo+ "." );
}

public static void Ejercicio4(){ //Ejercioo notas del trimenstre (apto o no apto)
     Scanner scanner = new Scanner(System.in);
System.out.println("Pon la primera nota del examen");//Se pide la primera nota 
double nota1 = scanner.nextDouble();

System.out.println("Pon la segunda nota del examen");// Se pide la segunda nota
double nota2 = scanner.nextDouble();

double media = (nota1 + nota2)/2.0; //Se calcula la media de las dos notas 

if (media>=5){ //Se ve si la media es mayor a 5 o menor
    System.out.println("Estas aprobado, has sacado " +media+ " .");
}
else { //Se pide que si se suspende diga si en la recuperación es apto o no 
    scanner.nextLine();

    System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = scanner.nextLine();

    if (recuperacion.equalsIgnoreCase("apto")) {//El equalsIgnoreCase sirve para que da igual como escribas la respues es decir da igual si pones Apto o ApTo
                System.out.println("Nota del trimestre: 5.0");
            } else {
                System.out.println("Nota del trimestre: " + media);
            }
        }

        scanner.close();
    }

public static void Ejercicio5(){ //Calendario del instituto
    Scanner scanner = new Scanner(System.in);
int opcion;
 
do {//Para hacer el menu con las opciones
System.out.println("MENU de los días de clase");
System.out.println("1. Lunes");
System.out.println("2. Martes");
System.out.println("3. Miercoles");
System.out.println("4. Jueves");
System.out.println("5. Viernes");
System.out.println("6. Calendario completo");
System.out.println("7. Salir");

opcion = scanner.nextInt();
switch (opcion) { //Comprobamos la opcion elegida
    case 1:
    System.out.println("\n[ LUNES ]");
    System.out.println("08:00 - 09:00 Entornos de desarrollo");
    System.out.println("09:00 - 10:00 Lenguaje de marcas");
    System.out.println("10:00 - 11:00 Base de datos");
    System.out.println("11:00 - 11:30 RECREO");
    System.out.println("11:30 - 12:30 Sistemas informaticos");
    System.out.println("12:30 - 13:30 Sistemas informaticos");
    System.out.println("13:30 - 14:30 Programación");
        break;
    case 2:
    System.out.println("\n[ MARTES ]");
    System.out.println("08:00 - 09:00 Sistemas informaticos ");
    System.out.println("09:00 - 10:00 Digitalización");
    System.out.println("10:00 - -11:00 IPPE");
    System.out.println("11:00 -  11:30 RECREO");
    System.out.println("11:30 - 12:30 Sostenibilidad");
    System.out.println("12:30 - 13:30 Programcación");
    System.out.println("13:30 - 14:30 Programcación");
        break;
    case 3:
    System.out.println("\n[ MIERCOLES ]"); 
    System.out.println("08:00 - 09:00 Programacion");   
    System.out.println("09:00 - 10:00 Programacion"); 
    System.out.println("10:00 - -11:00 IPPE");
    System.out.println("11:00 -  11:30 RECREO");
    System.out.println("11:30 - 12:30 Base de datos");
    System.out.println("12:30 - 13:30 Base de datos");
    System.out.println("13:30 - 14:30 Programacion");
        break;
    case 4:
    System.out.println("\n[ JUEVES ]");
    System.out.println("08:00 - 09:00 Lenguaje de marcas");
    System.out.println("09:00 - 10:00 Lenguaje de marcas");
    System.out.println("10:00 - 11:00 Base de Datos");
    System.out.println("11:00 -  11:30 RECREO");
    System.out.println("11:30 - 12:30 Base de Datos");
    System.out.println("12:30 - 13:30 Programación");
    System.out.println("13:30 - 14:30 Programación");
        break;
    case 5:
    System.out.println("\n[ VIERNES ]");
    System.out.println("08:00 - 09:00 Sistemas Informaticos");
    System.out.println("09:00 - 10:00 Sistemas Informaticos");
    System.out.println("10:00 - 11:00 Base de datos");
    System.out.println("11:00 -  11:30 RECREO");
    System.out.println("11:30 - 12:30 Entornos de desarrollo");
    System.out.println("12:30 - 13:30 Entornos de desarrollo");
    System.out.println("13:30 - 14:30 IPPE");
        break;
    case 6:
System.out.println("\n================================ HORARIO COMPLETO ================================");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "E.Desarrollo", "Sistemas", "Programación", "L. Marcas", "S.Informaticos");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "L. Marcas", "Digitalización", "Programación", "L.Marcas", "S.Informaticos");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "B. Datos", "IPPE", "IPPE", "B.Datos", "B. Datos");
                    System.out.println("----------------------------------- RECREO ---------------------------------------");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Sistemas", "Sostenibilidad", "B. datos", "B.Datos", "Programación");
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Programación", "Programación", "Programación", "Programación", "IPPE");
                    System.out.println("==================================================================================");
                break;

    case 7:
        System.out.println("\nSaliendo del programa... ¡Hasta luego!");
                    break;        
                    default:
        break;
    } 
} while (opcion != 7); // cierra do y repite mientras la opción no sea 7
scanner.close();
}

public static void Ejercicio6(){ //Calculo del sueldo de un trabajador en una empresa
    Scanner scanner = new Scanner(System.in);
// 1º Pido que se introduzca los datos.
System.out.print("Introduce tu cargo en la empresa (1 - Prog. junior, 2 - prog. senior. 3 - jefe de proyecto: ");
int cargo = scanner.nextInt();

System.out.print("¿Cuantos días has estado de viaje visitando clientes? ");
int diasViaje = scanner.nextInt();

System.out.print("Introduce tu estado civil (1 - Soltero, 2 - Casado): ");
int estadoCivil = scanner.nextInt();

//Calculo el sueldo dependiendo en el cargo que este 

double sueldoBase = 0;
switch (cargo) {
    case 1:
        sueldoBase = 950.0;
        break;
    case 2: 
        sueldoBase = 1200.0;
        break;
    case 3: 
        sueldoBase = 1600.0;
        break;
    default:
        System.out.println("El cargo no existe.");
        break;
}

//Calculo de los sueldos 
double dietas = diasViaje * 30.0;
double sueldoBruto = sueldoBase + dietas;

//calculos del IRPF
double porcentajeIRPF = 0.0;
int porcentajeTexto = 0;

if (estadoCivil == 1) {
    porcentajeIRPF = 0.25;
    porcentajeTexto = 25;
} else if (estadoCivil == 2){
    porcentajeIRPF = 0.20;
    porcentajeTexto = 20;
}

double retencionIRPF = sueldoBruto * porcentajeIRPF;
double sueldoNeto = sueldoBruto - retencionIRPF;

//Tabla de la nomina
System.out.println("----------------------------------------------");
System.out.printf("| Sueldo base %15.2f |\n", sueldoBase);
        System.out.printf("| Dietas (%2d viajes) %12.2f |\n", diasViaje, dietas);
        System.out.println("|---------------------------------------------|");
        System.out.printf("| Sueldo bruto %14.2f |\n", sueldoBruto);
        System.out.printf("| Retención IRPF (%d%%) %11.2f |\n", porcentajeTexto, retencionIRPF);
        System.out.println("|---------------------------------------------|");
        System.out.printf("| Sueldo neto %15.2f |\n", sueldoNeto);
        System.out.println("----------------------------------------------");

scanner.close();
}

public static void Ejercicio7(){ //Introducir numeros enteros hasta poner 0
    Scanner scanner = new Scanner(System.in);

int numero = 0;
int positivo = 0;
int negativo = 0; 
int contadorTotal = 0;
double sumaTotal= 0;
int contadorSietes = 0;

System.out.println("Introduce un numero entero. ");
do {
    numero = scanner.nextInt();

//Si se introduce el 0 no lo procesara como estadistica
if (numero != 0){
    contadorTotal++;
    sumaTotal += numero;
}
//Comprobar si es positivo o negativo
if (numero > 0){
    positivo++;
}else {
    negativo++;
}
//Comprobar si es un 7 o un -7
if ( numero == 7 || numero == -7){
    contadorSietes++;

}
} while (numero != 0); // El bucle que se repite mientras el numero no sea 0

//Resultados finales
System.out.println("\n--- RESULTADOS ---");
        System.out.println("Has introducido " + positivo + " números positivos.");
        System.out.println("Has introducido " + negativo + " números negativos.");

        // Evitamos el error matemático de dividir entre cero si solo introducen un 0 al principio
        if (contadorTotal > 0) {
            double media = sumaTotal / contadorTotal;
            System.out.printf("La media de los números es: ", media);
        } else {
            System.out.println("No se ha introducido ningún número para calcular la media.");
        }

        System.out.println("El número 7 o -7 se ha repetido: " + contadorSietes + " veces.");
    


scanner.close();
}

public static void Ejercicio8(){ //Ejercicio de la de la serie de Fibonacci. 
    Scanner scanner = new Scanner(System.in);
System.out.print("Introduce cuántos números de la serie quieres ver (n): ");
        int n = scanner.nextInt();
    int a= 0;
    int b =1;
System.out.println("La serie de Fibonacci es:");

        // 3. Uso un bucle 'for' para repetir el proceso 'n' veces
        for (int i = 1; i <= n; i++) {
            
            // Imprimo el número actual (a) seguido de un espacio
            System.out.print(a + " ");

            // 4. Calculo el siguiente número sumando los dos anteriores
            int siguiente = a + b;

            // 5. Actualizo las variables para la siguiente vuelta
            a = b;         
            b = siguiente; 
        }



scanner.close();
}

public static boolean Ejercicio9(int n) {//Ejercicio numeros primos
        boolean primo = true;
       if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;

}



    // 2. Tu programa principal
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (Ejercicio9(i)) {
                System.out.print(i + " ");
            }
        }
    } 
}



























