import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Introduce cuantas personas vais al cine: ");
    int numEntradas = sc.nextInt();

    System.out.println("¿Que día de la semana vas?");
    int DiaSemana = sc.nextInt();
 System.out.println("¿Tienes tarjeta cine? (Si o no)");
    String respuesta1 = sc.next();
    boolean TarjataCine = respuesta1.equalsIgnoreCase("s");
double Descuento = 0;

  
   
//Hago el switch porque hay diferentes dias y diferentes opciones 
    double precioBase = 8;
    double precioMiercoles = 5;
    switch (DiaSemana) {
        case 1:
            if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioBase = 8;
            }
        break;
        case 2:if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioBase = 8;
            }
        break;
        case 3:if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioMiercoles= 5;
            }
        break;
        case 4:
            if (numEntradas == 2) {
                precioBase = 11;
            } else {
                precioBase = 8;
            }
            if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioBase = 8;
}
        break;
        case 5:if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioBase = 8;
            }
        break;
        case 6:if (TarjataCine == true) {
      Descuento = precioBase *0.10;
      double precioFinal = Descuento - precioBase;
      System.out.println("Tienes un descuento del 10% " +precioFinal);
} else {
    precioBase = 8;
            }
        break;
        case 7:if (TarjataCine == true) {
      Descuento = precioBase *0.10;
} else {
    precioBase = 8;
            }
        break;
    default:
        System.out.println("Este dia no existe");
        break;
    }

//Calculos 
double PrecioTotal = precioBase*numEntradas;

System.out.println("Aqui tiene sus entradas, gracias por la compra");
System.out.println("Entradas grupales: " +numEntradas);
System.out.println("Precio de las entradas individuales: " +precioBase);
System.out.println("Total: " +PrecioTotal);
System.out.println("Descuento: " +Descuento);
System.out.println("Precio a pagar: " +PrecioTotal);
sc.close();
}
    }

