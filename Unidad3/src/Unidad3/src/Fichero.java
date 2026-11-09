package Unidad3.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Fichero {
    public static void main(String[] args) {
        //Búsqueda del directorio desde comienza la lectura de archivos en mi proyecto
        // System.out.println("Directorio actual: " + new File(".").getAbsolutePath());
        //Vamos a leer un archivo y mostrar su contenido
        // System.out.println("Leyendo el fichero con BufferedReader y procesando con Scanner");
        // try{
        //     //Opción 1
        //     // File archivo=new File("./FicheroEjemplo.txt");
        //     // FileReader lectura=new FileReader(archivo);
        //     // BufferedReader leer = new BufferedReader(lectura);
        //     //Opción 2
        //     BufferedReader leer = new BufferedReader(new FileReader("./FicheroEjemplo.txt")); //Mucho ojo con la ruta del archivo
        //     String linea;
        //     while((linea=leer.readLine())!=null){
        //         System.out.println(linea);
        //     }
        //     leer.close();//Cerrarlo tras su uso
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        
        // System.out.println("Leyendo el fichero con Scanner y procesando con Scanner");
        // System.out.println("Procesar un archivo por líneas para calcular la media de cada línea");
        // try{
        //     //Leer el archivo
        //     Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
        //     String linea;
        //     int suma=0;
        //     double contador=0;
        //     //Procesamos el archivo línea a línea
        //     while(leer.hasNextLine()){
        //         //Guardo la línea a leer y a procesarla con Scanner
        //         linea=leer.nextLine();
        //         System.out.println("Línea a procesar: "+linea);
        //         Scanner sc = new Scanner(linea);
        //         suma=0;
        //         contador=0;
        //         while(sc.hasNextInt()){//Dentro de la línea voy leyendo los números
        //             int numero1=sc.nextInt();
        //             contador++;
        //             suma+=numero1;
        //         }
        //         System.out.println("Media de la línea: "+suma/contador);
        //         sc.close(); //Cerramos la lectura de esa línea (opcional)
        //     }
            
        //     leer.close();//Cerrarlo tras su uso

        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        // //LECTURA DE NÚMEROS CON DELIMITADORES
        // try{
        //     Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
        //     String linea;
            
        //     while(leer.hasNextLine()){
        //         linea=leer.nextLine();
        //         System.out.println(linea);
        //         Scanner sc = new Scanner(linea);//Procesar la línea leída
        //         sc.useDelimiter("[a-z?;\\s/]+");//filtro lo que quiero leer
        //         int numero1=sc.nextInt();
        //         int numero2=sc.nextInt();
        //         int numero3=sc.nextInt();
        //         System.out.println(numero1+"-"+numero2+"-"+numero3);
        //     }
        //     leer.close();
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        //Procesar un archivo de un juego que dice victorias de jugadores
        leerDatos("./Victoras.txt");



    }
    public static void leerDatos(String ruta) {
        int partidasJugador1=0,partidasJugador2=0,partidasJugador3=0;
        try {
            Scanner sc = new Scanner(new File(ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //Lectura de toda la línea
                Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
                while(scLinea.hasNext()){
                    scLinea.useDelimiter("[=\\s]+");
                    String jugador = scLinea.next();
                    int partidas = scLinea.nextInt();
                    if(jugador.equals("jugador1")){
                        partidasJugador1=partidas;
                    }
                    else if(jugador.equals("jugador2")){
                        partidasJugador2=partidas;
                    }
                    else{
                        partidasJugador3=partidas;
                    }
                }
                scLinea.close();
            }
            System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero.");
        }
    }
}
  

