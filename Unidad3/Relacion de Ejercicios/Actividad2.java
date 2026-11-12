public class Actividad2 {
     public static class Racional{
        int numerador;
        int denominador;
    public Racional(){}

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
    }

     }

