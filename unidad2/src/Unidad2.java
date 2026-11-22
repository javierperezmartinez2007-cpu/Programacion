
import java.time.LocalDateTime;
import java.util.Scanner;

import utilidades.Matematicas;


public class Unidad2 {

    /**
     * Función main para ejecutar código java
     * @param args es un argumento
     */
    public static void main(String[]args) {
        //CLASE 1
        // //variable del lado del cuadrado
        // double edad;
        // edad=400000000;
        // boolean logico=(7<5);
        // String caracter="Domingo";

        // // System.out.println("Hola mundo");
        // // System.out.println(edad);
        // // System.out.println(logico);
        // int numerador = (1+2+3+1);
        // double denominador=3;
        // System.out.println("HOLA MUNDO "+edad+", "+logico);
        // System.out.println((1+2+3+1)/3);
        // System.out.println((1+2+3+1)/3.0);
        // System.out.println(numerador/denominador);

        // int a='A';
        // a='b';
        // System.out.println(a);

        // int[]b={4,0,-1};
        // System.out.println(b);
        // System.out.println(b[1]);
        // a='c';

        // final int VALOR;
        // VALOR=5;



        // int variable=0;
        // System.out.println(variable);
        // // Declarar varias variables en una línea
        // int uno=1,dos=2,tres=3;

        // /*
        // este párrafo es un comentario
        // asdfadsf
        // asdfasdf
        // asdfasdf
        // */
        // System.out.println("=========================================");
        // System.out.println("| Qué contento estoy que es viernes!! || 🗻♌ |");
        // System.out.println("=========================================");
        
        //CLASE 2
        //Ejemplo de introducir un valor por teclado
        // Scanner sc=new Scanner(System.in);
        // int numero;
        // //Ejemplo de pedir un número y mostrarlo
        // System.out.println("Introduce un número entre 5 y 25:");
        // numero=Integer.parseInt(sc.nextLine());
        // System.out.println("Introduce un nombre:");
        // String nombre=sc.nextLine();
        // System.out.println("El número introducido es: "+numero+" y tu nombre es "+nombre);
        
        // System.out.println("Introduce tu apellido: ");
        // String apellido=sc.nextLine();
        // System.out.println("Tu apellido es: "+apellido);

        // System.out.println("Dame tu nombre, edad, profesion");
        // // String resultado=sc.nextLine();
        // String nombre=sc.next();
        // int edad=sc.nextInt();
        // String profesion=sc.nextLine();
        // System.out.println(nombre+" "+edad+" "+profesion);

        // //Versión 25 JDK
        // edad=Integer.parseInt(IO.readln("Introduce un número"));
        // IO.println(edad);

        // sc.close();

        // LocalDateTime hoy = LocalDateTime.now();

        // System.out.println("Hoy es: " + hoy.getDayOfWeek());   // nombre del día
        // System.out.println("El día es: " + hoy.getDayOfMonth());
        // System.out.println("El mes es: " + hoy.getMonth());    // nombre del mes
        // System.out.println("El año es: " + hoy.getYear());
        // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        // int max=26;
        // int min=0;
        // char letra='a';
        // int aleatorio=(int)(Math.random()*(max-min+1)+min);
        // System.out.println((char)(letra+aleatorio));
        
        //CLASE 3
        //Utilizar las funciones sumar y multiplicar de la clase Matemáticas
        // int numero1=3;
        // int numero2=5;
        // System.out.println("La suma es: "+Matematicas.sumar(numero1,numero2));
        // System.out.println("La multiplicación es: "+Matematicas.multiplicar(numero1,numero2));

        // System.out.println("El resto de la division 5/2 es: "+(5%2));
        // int variable=2;
        // System.out.println("La variable vale: "+variable);
        // variable--; // variable=variable+1;
        // System.out.println("La variable vale: "+variable);

        // int valor1=3;
        // int valor2=5;
        // valor1+=valor2;//valor1=valor1+valor2;

        //Condiciones IF-ELSE
        // int numero=3;
        // int numero2=5;
        // int resultado;

        // if(numero>numero2){
        //     //Si se cumple hará esto
        //     resultado=numero+numero2;
        // }
        // else{
        //     //Si se no se cumple hará esto
        //     resultado=numero-numero2;
        // }
        // System.out.println(numero+" "+numero2+" "+resultado );
        
        // //Usando el operador ternario
        // resultado=(numero>numero2) ? numero+numero2:numero-numero2;
        // System.out.println(numero+" "+numero2+" "+resultado );
        // System.out.println("POR AQUÍ VOY");

        //IF-ELSE ENCADENADO
        // int dia=3;
        // if(dia==1)
        //     System.out.println("LUNES");
        
        // else if (dia==2){
        //     System.out.println("MARTES");
        //     System.out.println("asdfadf");
        // }
        // else if (dia==6){
        //     System.out.println("SÁBADO");
        // }
        // else{
        //     System.out.println("DOMINGO");
        // }

        // //SWITCH
        // int valor=3;
        // switch(valor){
        //     case 1: System.out.println("Lunes"); break;
        //     case 2: System.out.println("MARTES"); break;
        //     case 3: 
        //         System.out.println("MIÉRCOLES"); 
        //         System.out.println("Hola qué tal!!");
        //         break;
        //     case 4: System.out.println("JUEVES"); break;
        //     case 5: System.out.println("VIERNES"); break;
        //     case 6: System.out.println("SÁBADO"); break;
        //     case 7: System.out.println("DOMIngo"); break;
        //     default:System.out.println("Valor incrorrecto"); break;
        // }
        // System.out.println("POR AQUí");

        //Clase 4: Bucles
        //ESTRUCTURAS: FOR
        // for(int i=0;i<=5;i++){
        //     System.out.println(i);
        // }
        //ESTRUCTURA WHILE
        // int i=0;
        // while(i<0){
        //     System.out.println(i);
        //     i++;
        // }
        // //ESTRUCTURA DO-WHILE
        // i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<0);

        //Clase 5: bucles anidados y funciones
        // for(int i=1;i<=4;i++){
        //     if(i%2==0){//Mostrar sólo las filas pares
        //         for(int j=i;j<=4;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }

        //Clase 6:Recursividad
        // int a = 254; 
        // System.out.println(funcion(a, 2));
        // incre(4);
        // System.out.println(digitosNumero(327));
        // System.out.println(potencia(2, 8));
        //Ejecutar Torres Hanoi
        // Hanoi(20,1,2,3);

        //ASERT Y EXCEPCIONES
        // int edad = -5;
        // assert edad >= 0 : "Edad incorrecta";
        // System.out.println("Fin");

        //Atender excepciones
        try{
            imprimirDivision();
        }catch(Exception e){
            System.out.println("");
        }

        

    }
    
    public static void imprimirDivision() throws Exception{
        try{
            int resultado=dividir(10,3);
            System.out.println(resultado);
        }catch(ArithmeticException e){
            System.out.println("Error1");
        }
    }
    public static int dividir(int numerador,int denominador) throws Exception{
    
            return numerador/denominador;
        
    }
    public static int calcularFactorial(int n){
        //Caso base
        if(n==1) return 1;
        else{ 
            return n*calcularFactorial(n-1);
        }
    }
    public static int funcion(int num, int pos){
        if(num < 10){
            return num; 
        }else{
            return (funcion(num/10, pos-1))+(num % 10)*(int) Math.pow(10, pos)  ;
        }
    }
    /// PILA DE LLAMADAS PARA 254
    /// 254 -> 4*10^2+funcion(25,1)
    ///                 -> 5*10¹+funcion(2,0)
    ///                         -> 2
    /// 
    /// Una vez cambio a (funcion(num/10, pos-1))+(num % 10)*(int) Math.pow(10, pos) ;
    /// 254 -> funcion(25,1)+4*10²
    ///           -> funcion(2,0)+5*10¹
    ///                 -> 2
    /// 
    public static void incre(int n){
        if(n>0){
            System.out.print(n);
            incre(n-1);
        }
        else
        System.out.println();
    }
    //Pila de llamadas para n=4
    /// n=4 -> incre(3) y después imprimes 4
    ///         -> incre(2) y despué imprimes 3
    ///             -> incre(1) y después imprimes 2
    ///                 -> incre(0) y después imprimes 1
    /// 
    //                     "\n"

    public static int digitosNumero(int n){
        //Caso base
        if(n>0 && n<=9){
            return 1;
        }
        else{//Caso recursivo
            return 1+digitosNumero(n/10);
        }
    }


    //Ejemplo sumaN
    public static int sumaN(int N){
        //Enfoque iterativo
        // int suma=0;
        // for(int i=1;i<=N;i++){
        //     suma=suma+i;
        // }
        // return suma;

        //Enfoque recursivo
        //Caso base
        if(N==1){ return 1;}
        else{ //Caso recursivo  
            return N+sumaN(N-1);
        }
    }

    //Torres Hanoi
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
        }else{
	     //Se llevan los n-1 de origen al auxiliar
           Hanoi(n-1, origen, destino, auxiliar);
	     //Se llevan el que queda a destino
           System.out.println("mover disco de "+ origen + " a " + destino);
	     //Se llevan los n-1 de auxiliar a destino
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }
    //calcular potencia 
    public static int potencia(int a, int b){
        //Enfoque iterativo a^b Ej: 3⁴=3*3*3*3 
        // int potencia=1;
        // for(int i=1;i<=b;i++){
        //     potencia=potencia*a;
        // }
        // return potencia;
        //Caso base
        if(b==1){ return a;}
        else{
            return a*potencia(a,b-1);
        }
    }
}