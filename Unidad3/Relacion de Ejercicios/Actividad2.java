public class Actividad2 {
     public static class Racional{
       private  int numerador;
       private  int denominador;
    public Racional(){}
public void imprimirRacional() {
        System.out.println(numerador + "/" + denominador);
    }
    public Racional(int numerador, int denominador){
        this.denominador = denominador;
        this.numerador = numerador;
    }
    public Racional(Racional otro){
        this.denominador = otro.getDenominador();
        this.numerador = otro.getNumerador();
    }
        public int getNumerador() {
            return numerador;
        }
        public void setNumerador(int numerador) {
            this.numerador = numerador;
        }
        public int getDenominador() {
            return denominador;
        }
        public void setDenominador(int denominador) {
            this.denominador = denominador;
        }  
        public int mcm(int numerador, int denominador){
            return numerador*denominador;
        }
      //  El método que calcula el MCD 
public int mcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// El método simplificar que llama al mcd de arriba
public void simplificar() {
    if (denominador < 0) { 
        numerador = -numerador;
        denominador = -denominador;
    }
    int divisor = mcd(numerador, denominador); // Aquí usa los atributos de la clase
    if (divisor != 0) {
        numerador /= divisor;
        denominador /= divisor;
    }
}

public  Racional sumar (Racional r){ 
    int nuevoNum = (this.numerador* r.denominador) + (r.numerador * this.denominador);
    int nuevoDen = this.denominador*r.denominador;
    return new Racional(nuevoNum, nuevoDen);

}

public Racional restar (Racional r){
     int nuevoNum = (this.numerador*r.denominador) - (r.numerador * this.denominador);
     int nuevoDen = this.denominador*r.denominador;
     return new Racional(nuevoNum, nuevoDen);
}

public Racional multiplicar(Racional r){
    int nuevoNum = this.numerador * r.numerador;
    int nuevoDen = this.denominador * r.numerador;
    return new Racional(nuevoNum, nuevoDen);

}
public Racional dividir(Racional r){
    int nuevoNum = this.numerador * r.denominador;
    int nuevoDen = this.denominador * r.numerador;
    return new Racional(nuevoDen, nuevoNum);
}

public boolean esIgual(Racional r){
    return (this.numerador * r.denominador) == (r.numerador * this.denominador);

}
    }
public static void main(String[] args) {
    Racional r1 = new Racional(2, 4); // Se simplifica automáticamente a 1/2
        Racional r2 = new Racional(3, 6); // Se simplifica automáticamente a 1/2

        System.out.print("Racional 1: ");
        r1.imprimirRacional();

        System.out.print("Racional 2: ");
        r2.imprimirRacional();

        System.out.println("¿Son iguales r1 y r2? " + r1.esIgual(r2));

        // Probando la suma
        Racional r3 = new Racional(1, 4);
        Racional r4 = new Racional(1, 2);
        Racional suma = r3.sumar(r4);
        System.out.print("Suma (1/4 + 1/2): ");
        suma.imprimirRacional(); 
    }
}

     
