
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Unidad3 {


    public static void main(String[] args) throws Exception {
         //Crear un objeto persona
        persona p=new persona();
        persona p2=new persona("Domingo",41,1.70);
        //Dar un nombre a la persona
        p.setNombre("Luis");
        p.saludar();

        p2.saludar();
        p2.presentacion();


        //Crear 3 personas
        persona pepa=new persona("Pepa",18,1.87);
        persona miguel=new persona("Miguel",27,1.79);
        persona paco=new persona("Paco",51,1.68);

        // Persona otra=pepa; //ESTO ES UNA REFERENCIA EN MEMORIA RAM
        persona otra=new persona(pepa);
        pepa.presentacion();
        //otra.nombre="Antonio";//SUSPENSO AUTOMÁTICO EN EL EXAMEN
        otra.setNombre("Luis"); //Hay que utilizar los métodos que acceden a los atributos
        pepa.presentacion();
        otra.presentacion();
        Persona2.imprime();
        Persona2 nueva=new Persona2("12345", "21/10/2026");
        nueva.imprime();
        // int x=Matematicas.sumar(2,3);
    }


}
