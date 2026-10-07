import java.util.Scanner;

public class Relacionejercicios {
    public static void main(String[] args) {
//     Actividad 1:Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora
// actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)

// int hora = java.time.LocalTime.now().getHour();//now().getHour() sirve para obtener la hora actual.
// if (hora >= 6 && hora <= 12) {
//     System.out.println("Buenos días");
// } else if (hora >= 13 && hora <= 20) {
//     System.out.println("Buenas tardes");
//     if (hora >= 21 || hora <= 5) {
//         System.out.println("Buenas noches");
//     }
// }

//  Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
// horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se
// pagan a 16 euros la hora
Scanner scanner = new Scanner(System.in);

//Pedimos el horario del trabajador 
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
}
