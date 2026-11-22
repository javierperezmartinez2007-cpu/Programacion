import java.util.Scanner;

public class Actividad1 {
  public static void main(String[]args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce cuantas personas vais al cine: ");
    int numEntradas = sc.nextInt();

    System.out.println("¿Que día de la semana vas?");
    int DiaSemana = sc.nextInt();
 System.out.println("¿Tienes tarjeta cine?");
    boolean TarjataCine = sc.hasNextBoolean();
   
//Hago el switch porque hay diferentes dias y diferentes opciones 
    double precioBase = 8;
    switch (DiaSemana) {
        case 1:
            precioBase = 8;
        break;
        case 2:
            precioBase = 8;
        break;
        case 3:
            precioBase = 5;
        break;
        case 4:
            if (numEntradas == 2) {
                precioBase = 11;
            } else {
                precioBase = 8;
            }
            if (TarjataCine) {
    precioBase = precioBase / 10;
} else {
    precioBase = 8;
}
        break;
        case 5:
            precioBase = 8;
        break;
        case 6:
            precioBase = 8;
        break;
        case 7:
            precioBase = 8;
        break;
    default:
        System.out.println("Este dia no existe");
        break;
    }

//Calculos 
double PrecioTotal = precioBase*numEntradas;
System.out.println("Tienes que pagar " +PrecioTotal+ " .");
System.out.println("Gracias Por su compra");
System.out.println("Precio de la entrada normal " +precioBase);
System.out.println("A Pagar " +PrecioTotal);
sc.close();
}
}