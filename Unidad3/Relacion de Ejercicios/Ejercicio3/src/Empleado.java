public class Empleado {
private     int DNI;
private     String nombre;
private     String domicilio;
private     String legajo;
private     String domicalle;
private     String domiciudad;
private     String dominumero;
private     int telefonos;

   

    //Constructor sin parametros 
    public  Empleado(){}

    //Constructor con parametros
    public  Empleado(int dNI, String nombre, String domicilio, String legajo, String domicalle, String domiciudad,
            String dominumero, int telefonos) {
        this.DNI = dNI;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.legajo = legajo;
        this.domicalle = domicalle;
        this.domiciudad = domiciudad;
        this.dominumero = dominumero;
        this.telefonos = telefonos;
    }
    
    public  Empleado (Empleado otro){
        this.nombre = otro.getNombre();
        this.DNI = otro.getDNI();
        this.domicilio = otro.getDomicilio();
        this.legajo = otro.getLegajo();
        this.domicalle = otro.getDomicalle();
        this.domiciudad = otro.getDomiciudad();
        this.dominumero = otro.getDominumero();
        this.telefonos = otro.getTelefonos();
        
    }
     public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDomicalle() {
        return domicalle;
    }

    public void setDomicalle(String domicalle) {
        this.domicalle = domicalle;
    }

    public String getDomiciudad() {
        return domiciudad;
    }

    public void setDomiciudad(String domiciudad) {
        this.domiciudad = domiciudad;
    }

    public String getDominumero() {
        return dominumero;
    }

    public void setDominumero(String dominumero) {
        this.dominumero = dominumero;
    }

    public void ImprimirEmpleado(){
        System.out.println("El DNI del empleado es: " +DNI);
        System.out.println("El nombre del empleado: " +nombre);
        System.out.println("Los telefonos del empleado son: " +telefonos);
        System.out.println("Este es el domicilio del empleado: " +domicilio);
        System.out.println("Esta es la calle del Empleado: " +domicalle) ;
    }
    

    
}
