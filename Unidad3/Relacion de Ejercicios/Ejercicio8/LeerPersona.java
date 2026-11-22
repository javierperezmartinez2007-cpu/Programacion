

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerPersona {
    public static void main(String[] args) {
        // Ajusta la ruta si ejecutas desde otra carpeta distinta a Ejercicio8
        String rutaFichero = "personas.csv";

        // Creamos la persona vacía
        Persona5 persona = new Persona5();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\javie\\OneDrive\\Desktop\\Programaci-n\\Unidad3\\Relacion de Ejercicios\\Ejercicio8\\personas.csv"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] partes = linea.split(";");

                persona.setNombre(partes[0]);
                persona.setEdad(Integer.parseInt(partes[1].trim()));
                persona.setTelefono(partes[2]);
                persona.setPoblacion(partes[3]);

                // Mostramos los datos antes de pasar a la siguiente línea
                persona.mostrarDatos();
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la edad a número: " + e.getMessage());
        }
    }
}
