public class persona {
    //Atributos
    String nombre;
    int Edad;
    double estatura;
    final String DNI;

    //Constructor

    public persona (){
        this.DNI = ""; } //Constructor por defecto
    public persona (String nombre, int edad, double estatura) {
        this.DNI = "";
        this.nombre = nombre;
     this.Edad = edad;
        this.estatura = estatura;
    }
    // public Persona (Persona otra){
        
    
    //metodos
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
public void setEdad(int Edad){
    this.Edad=Edad;
}

public void  setEstura(double estatura){
        this.estatura=estatura;
}
    
    public void saludar(){
        System.out.println("Hola a todos, soy " +this.nombre);

    }
    public String getNombre(){
        return this.nombre;
    }

public int getEdad() {
        return Edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void presentacion(){
        System.err.println("Hola soy " +nombre  );
    }

public  void main (String [] arg){
    persona p=new persona();
    persona p2=new persona ( "Javier", 18, 1.9) ;
    //Dar un nombre a la persona
    p.setNombre("javier");
    p.saludar();

    p2.saludar();
    
    //Crear tres personas
    persona pepa=new persona( "pepa", 20, 1.69);
    persona miguel=new persona("miguel", 40, 23);
    persona paco=new persona("Paco", 20, 1.90);


    persona otra=pepa;
    pepa.presentacion();
    otra.setNombre("Luis");
    pepa.presentacion();
}

}
