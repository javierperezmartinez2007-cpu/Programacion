
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
public class ProcesarHeroes {
    public static void main(String[] args) {
    JSONParser parser = new JSONParser();
try {
 // Leer el fichero JSON
    Object obj = parser.parse(new FileReader("./heroes.json"));
 // Convertir el contenido en un array JSON
    JSONArray heroes = (JSONArray) obj;
    System.out.printf("%-20s %-30s%n","SUPERHEROE", "ALTER EGO");
    System.out.println("-----------------------------------------------");
 // Recorrer los héroes del fichero (ahora es un array)
 for (Object elemento : heroes) {
    JSONObject heroe = (JSONObject) elemento;
 //Vamos a ller datos del héroe
    String superhero = (String) heroe.get("superhero");
    String publisher = (String) heroe.get("publisher");
    String alterEgo = (String) heroe.get("alter_ego");
 // Mostrar únicamente los héroes de Marvel
 if (publisher.equals("Marvel Comics")) {
 System.out.printf("%-20s %-30s%n",superhero, alterEgo);
 }
 }
 System.out.println("-----------------------------------------------");
}catch (IOException e) {
    System.out.println("Error: en lectura del archivo JSON");
}catch(ParseException e) {
    System.out.println("Error: en lectura del archivo JSON");
}
}
}
