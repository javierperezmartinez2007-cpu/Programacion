public class Unidad4 {
     public static void main(String[] args) {
        int[] numeros={0,0,0,0,0};
        int random;


        //Recorrer el verctot.
        System.out.println("Vector inicial: ");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+", ");
        }

        System.out.println();
        System.out.println("Vector RESULTADO:   ");
        //Asignamos a cada posicion un valor.
        for(int i=0;i<numeros.length;i++){
            random=(int)(Math.random()* 10)+1;
            numeros[i]=random;
            System.out.println(numeros[i]+", ");
        }
        System.out.println();
    }
}
