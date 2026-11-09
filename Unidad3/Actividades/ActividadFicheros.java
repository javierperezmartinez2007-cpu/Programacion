package Unidad3.Actividades;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class ActividadFicheros {
    public static void leerFichero(){
        try {
            File fichero = new File("./FicheroEjemplo.txt");

            if (!fichero.exists() && !fichero.isFile()) {
                System.out.println("El fichero no existe O no es un fichero");
            } else {

                Scanner teclado = new Scanner(System.in);

                System.out.print("Introduce la palabra que quieres buscar: ");
                String palabraBuscada = teclado.next();

                int contador = 0;

            
                Scanner sc = new Scanner(fichero);

                while (sc.hasNextLine()) {
                    String linea = sc.nextLine();
                    System.out.println(linea);
                    Scanner scLinea = new Scanner(linea);
                    scLinea.useDelimiter("[,\\s]+");

                    while (scLinea.hasNext()) {
                        String palabra = scLinea.next();

                        if (palabra.equalsIgnoreCase(palabraBuscada)) {
                            contador++;
                        }
                    }

                    scLinea.close();
                }

                sc.close();

                System.out.println("La palabra '" + palabraBuscada +
                        "' aparece " + contador + " veces.");

            } 
        }catch (Exception e) {
            System.out.println("Error al leer el fichero.");
        }
    }

    public static void copiarArchivo(String ruta){
        try {
        File fichero = new File(ruta);

        if (!fichero.exists() && !fichero.isFile()) {
            System.out.println("El fichero no existe");
            return;
        }

        String nombre = fichero.getName();

        int posicionPunto = nombre.lastIndexOf('.');

        String nombreSinExtension;
        String extension;

        if (posicionPunto > 0) {
            nombreSinExtension = nombre.substring(0, posicionPunto);
            extension = nombre.substring(posicionPunto);
        } else {
            nombreSinExtension = nombre;
            extension = "";
        }

        LocalDate fecha = LocalDate.now();

        String nuevoNombre = nombreSinExtension + "_copia_" +
                fecha.getYear() + "_" +
                fecha.getMonthValue() + "_" +
                fecha.getDayOfMonth() + ".txt";

        File copia = new File(fichero.getParent(), nuevoNombre);

    
        Scanner lector = new Scanner(fichero);
        PrintWriter escritor = new PrintWriter(copia);

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            escritor.println(linea);
        }

        lector.close();
        escritor.close();

        System.out.println("Copia creada: " + copia.getName());

    } catch (FileNotFoundException e) {
        System.out.println("Error al copiar el fichero.");
    }

    }
    public static void main(){
        String ruta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del fichero: ");
        ruta = sc.nextLine();
        copiarArchivo(ruta);
    
    }
}
