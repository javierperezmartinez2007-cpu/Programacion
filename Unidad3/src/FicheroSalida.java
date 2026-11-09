package Unidad3.src;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroSalida {
    public static void main(String[] args) {
        // String contenido = "Este es un ejemplo de uso de PrintWriter en Java.";
        // try {
        //     //nombre y apellidos de la persoan
        //     Scanner sc = new Scanner(System.in);
        //     String nombre=sc.nextLine();
        //     String apellidos=sc.nextLine();
        //     PrintWriter escritor = new PrintWriter("ejemplo.txt");
        //     escritor.println("Te llamas "+nombre+" "+apellidos); // Escribimos la cadena y añadimos un salto de línea
        //     escritor.close(); // Cerramos el PrintWriter
        //     System.out.println("¡Archivo escrito con éxito!");
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        PrintWriter escritor; 
        try{
            int partidas1=4,partidas2=3,partidas3=0;
            escritor = new PrintWriter("./ejemplo.txt");
            escritor.println("jugador1="+partidas1);
            escritor.println("jugador2="+partidas2);
            escritor.println("jugador3="+partidas3);
            escritor.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}