public class Actividades {
    public static void main(String[] args) {
        //Actividad Diapositiva 9 Realiza un programa que genera 2 números y nos diga el cociente, la
// media, la potencia y la raíz cuadrada. Usa tipos adecuados
        
       // Generar dos números de manera aleartoria
       int min=1, max=10;
       int aleatorio1=(int)(Math.random()*(max-min+1)+min);
       double aleatorio2=(double)(Math.random()*(max-min+1)+min);

       // Realizar las operaciones
       System.out.println("Los números generados son: " + aleatorio1 + " y " + aleatorio2);
       System.out.println("La división es: " + (aleatorio1 / aleatorio2));
       System.out.println("La media es: " + ((aleatorio1 + aleatorio2) / 2.0));
        System.out.println("La potencia es: " + Math.pow(aleatorio1, aleatorio2));
        System.out.println("Las raices cuadradas son: " + Math.sqrt(aleatorio1) + " y " + Math.sqrt(aleatorio2)); 
    }
}
