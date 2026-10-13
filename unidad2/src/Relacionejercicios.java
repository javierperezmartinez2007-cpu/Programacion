import java.util.Scanner;

public class Relacionejercicios {

public static void Ejecicio1(){ //Actividad 1 (Buenos dias, Buenas tardes, Buenas noches)
if (hora >= 6 && hora <= 12) {
    System.out.println("Buenos días");
} else if (hora >= 13 && hora <= 20) {
    System.out.println("Buenas tardes");
    if (hora >= 21 || hora <= 5) {
        System.out.println("Buenas noches");
    }
}
}

    public static void main(String[] args) {


//  Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
// horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se
// pagan a 16 euros la hora
// Scanner scanner = new Scanner(System.in);

// //Pido el horario del trabajador 
// System.out.print("Añade las horas trabajadas");
// int horastrabajadas = scanner.nextInt();
// int salariototal;

// //Calculo segun las horas
// if (horastrabajadas <= 40) {
//     salariototal = horastrabajadas * 12;
// }
//  else {
//     int horasExtras = horastrabajadas - 40;
//     salariototal = (40*12) + (horasExtras * 16);
// }
 
// //Mostras resultado 
// System.out.println("El suedo de esta semana es " +salariototal+ " euros");

//Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento.
Scanner scanner = new Scanner(System.in);

//Pido dia y mes del año 
System.out.println("añade dia y mes de tu cumpleaños");
int dia = scanner.nextInt();
int mes = scanner.nextInt();
String signo = "";

//Que diga el signo del zodiaco dende del dia y el mes (utilizo el swich ya que son muchas condiciones)
// switch (mes) {
//     case 1: //Enero
//         if (dia <= 20) {
//             signo = "Capricornio";
//             }
//         else {
//             signo = "Acuario";
//         }
//         break;
//     case 2: //Febrero
//         if (dia <= 19) {
//             signo = "Acuario";
//         }
//         else {
//             signo = "Piscis";
//         }  
//     case 3: //Marzo
//         if (dia <= 21) {
//             signo = "Piscis";
//         }
//         else {
//             signo = "Aries";
//         }
//     case 4: //Abril
//         if (dia <= 20) {
//             signo = "Aries";
//         }
//         else{
//             signo = "Tauro";
//         }
//     case 5: //Mayo
//         if( dia <= 21) {
//             signo = "Tauro";
//         }
//         else {
//             signo = "Géminis";
//         }
//     case 6: //Junio
//         if (dia <= 23) {
//             signo = "Géminis";
//         }
//         else {
//             signo = "Cancer";
//         }
//     case 7: //Julio
//         if (dia <= 23){
//             signo = "Cancer";
//         }
//         else {
//             signo = "Leo";
//         }
//     case 8: //Agosto
//         if (dia <= 23) {
//             signo = "Leo";
//         } 
//         else {
//             signo = "Virgo";
//         }
//     case 9: //Septiembre
//         if (dia <= 23) {
//             signo = "Virgo";
//         }
//         else {
//             signo = "Libra";
//         }
//     case 10:
//         if (dia <= 23) {
//             signo = "Libra";
//         }
//         else {
//             signo = "Escorpio";
//         }
//     case 11:
//         if(dia <= 22){
//             signo = "Escorpio";
//         }
//         else {
//             signo = "Sagitario";
//         }
//     case 12:
//         if (dia <= 22) {
//             signo = "Sagitario";
//         }
//         else {
//             signo = "Capricornio";
//         }
//         break;
//     default:
//         signo = "desconocido (el mes introducido no es válido)";
//         break;
            
//     }
//    System.out.println("Tu signo del zodiaco es " + signo+ "." );
}
}








