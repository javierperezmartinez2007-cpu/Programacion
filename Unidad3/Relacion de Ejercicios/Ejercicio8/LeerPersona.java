

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerPersona {
    public static void main(String[] args) {
        // Ajusta la ruta si ejecutas desde otra carpeta distinta a Ejercicio8
        String rutaFichero =  "C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio8\\personas.csv";

        // Creamos la persona vacía
        Persona5 persona = new Persona5();

     
// C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio8\\personas.csv"
        Persona5 persona1 = new Persona5();
File fichero = new File(" C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio8\\personas.csv");

try (Scanner lector = new Scanner(fichero)) {
    while (lector.hasNextLine()) {
        String linea = lector.nextLine();

        int p1 = linea.indexOf(";");
        int p2 = linea.indexOf(";", p1 + 1);
        int p3 = linea.indexOf(";", p2 + 1);

        String nombre = linea.substring(0, p1);
        int edad = Integer.parseInt(linea.substring(p1 + 1, p2));
        String telefono = linea.substring(p2 + 1, p3);
        String poblacion = linea.substring(p3 + 1);

        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setTelefono(telefono);
        persona1.setPoblacion(poblacion);

        persona1.mostrarDatos();
    }
} catch (FileNotFoundException e) {
    System.out.println("No se ha encontrado el archivo.");

} catch (NumberFormatException e1) {
    System.out.println("Error al convertir la edad a número: " + e1.getMessage());
}
    }
}

