    import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona2{


    //atributos
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    String DNI;
    static int hijos;
    Persona2 pareja;

    //Constructor por defecto
    public Persona2(){}
    //Constructor por parámetros
    public Persona2(String DNI,String fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,fmt); 
        this.DNI=DNI;
        this.hijos=2;
        this.pareja=null;
    }
    //Constructor por copia
    public Persona2(Persona2 objeto){
        this.nombre=objeto.getNombre();
        this.fechaNacimiento=objeto.getFechaNacimiento();
        this.estatura=objeto.getEstatura();
        this.DNI=objeto.getDNI();
        this.hijos=objeto.getHijos();
        this.pareja=objeto.getPareja();

    }
    //métodos
    public void setHijos(int hijos){
        this.hijos=hijos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public static int getHijos() {
        return hijos;
    }
    public Persona2 getPareja() {
        return pareja;
    }
    public void setPareja(Persona2 pareja) {
        this.pareja = pareja;
    }
    public static void imprime(){
        System.out.println("HOLA");
    }
    

    // public void asignaPareja(Persona2 pareja){
    //     this.pareja=pareja;
    // }
    public static void main(String[] args) {
        Persona2 p=new Persona2("12345678A","15/08/1985");

        Persona2 p2=new Persona2("12345678B","01/07/1987");
        p2.setPareja(p);
        p.setPareja(p2);

    }
}

