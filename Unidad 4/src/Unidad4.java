public class Unidad4 {
     public static void main(String[] args) {
        // int[] numeros={0,0,0,0,0};
        // int random;


        // //Recorrer el verctot.
        // System.out.println("Vector inicial: ");
        // for(int i=0;i<numeros.length;i++){
        //     System.out.println(numeros[i]+", ");
        // }

        // System.out.println();
        // System.out.println("Vector RESULTADO:   ");
        // //Asignamos a cada posicion un valor.
        // for(int i=0;i<numeros.length;i++){
        //     random=(int)(Math.random()* 10)+1;
        //     numeros[i]=random;
        //     System.out.println(numeros[i]+", ");
        // }
        // System.out.println();
        // int[] numeros={6,7,9,6};
        // int [] resultado = null;
        // resultado=multiplica2(numeros);
        // //Sacar resultado
        // System.out.println("RESULTADO: ");
        // for(int i=0;i<resultado.length;i++){
        //     System.out.println(resultado[i]+ ", ");
        // }
        // System.out.println();

        // //Salida cuando se usa el propio parametro dentro de la función.

        // multiplica2bis(numeros);
        // //Sacar resultado
        // System.out.println("RESULTADO: ");
        // for(int i=0;i<resultado.length;i++){
        //     System.out.println(resultado[i]+ ", ");
        // }
        // System.out.println();
    
    
    
        //Uso de matrices
//  String[][] comidas = {
//  {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
//  {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", },
//  {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
//  };
//  String[] b = comidas[1];
//  System.out.println(comidas[1][2]);
//  System.out.println(b[2]);

   int [] Practica = {4,5,1,8,5};
        int [] Copia = {0,0,0,0,0};
        for(int i=0;i<Practica.length;i++){
            Copia[i]=Practica[i];
        }

        System.out.println(EncontrarNumero(Practica, 8));
        System.out.println(EncontrarNumero(Practica, 5));
 }
 

    
public static int EncontrarNumero (int [] Vector, int numero){
   int encontrados=-1;
   for(int i=0;i<Vector.length;i++){
    if(Vector[i]==numero) encontrados=i;

   }
   return encontrados;
    

}
//Opcion 2 hacer que solo saque la primera vez que emcuentra el numero con el ejemplo (4,5,1,8,5)
public static int EncontrarNumero2 (int [] Vector, int Practica){
   int encontrados=-1;
   boolean salida = false;
   int i=0;
  while (!salida) {
    if (Vector[i]==Practica){
        encontrados=i;
        salida=true;
        
    }
    i++;
    
  }
  return encontrados;

   }
 
    


    

    public static int[] multiplica2(int [] Vector){
        int [] salida={0,0,0,0};
        for(int i=0;i<Vector.length;i++){
            salida[i]=2*Vector[i];
        }
        return salida;
    }
    //Este es malo 
     public static void multiplica2bis(int [] Vector){
       
        for(int i=0;i<Vector.length;i++){
            Vector[i]=2*Vector[i];
        }
       
    }

    
}
