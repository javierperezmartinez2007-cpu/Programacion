import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FusionarFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pido que el usuario de las rutas de los ficheros y del directorio
        try{
           System.out.println("Escribe la ruta del primer fichero"); 
           String ruta1 = scanner.nextLine();
           
           System.out.println("Escribe la ruta del segundo fichero");
           String ruta2 = scanner.nextLine();

           System.out.println("Escribe el la ruta del directorio destino");
           String rutaDestino = scanner.nextLine();

           File fichero1 = new File("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\src\\Fichero1.txt\"");
           File fichero2 = new File("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\src\\Fichero2.txt\"");

           String nombre1 = fichero1.getName();
           String nombre2 = fichero2.getName();

           File FicheroSalida = new File("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\GuardarFichero\"", "Guardado.txt");

           BufferedReader leer1 = new BufferedReader(new FileReader("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\src\\Fichero1.txt\""));
           BufferedReader leer2 = new BufferedReader(new FileReader("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\src\\Fichero2.txt\""));
           BufferedWriter Escritor = new BufferedWriter(new FileWriter("\"C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio 4\\GuardarFichero\\Guardado.txt\""));
           
           String linea;

           //Copio el contenido de los ficheros
           while ((linea = leer1.readLine()) != null) {
           Escritor.write(linea);
           Escritor.newLine();
           } 
           while ((linea = leer2.readLine()) != null ) {
            Escritor.write(linea);
            Escritor.newLine();
            
           }
           leer1.close();
           leer2.close();
           Escritor.close();
           scanner.close();
           
           System.out.println("Fichero creado " +FicheroSalida.getAbsolutePath());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    
    
}
