

public class Actividad1 {
    public static class Pais{
        private String nombre;
        private int poblacion;
        private int PIB;

    public Pais(){}

    public  Pais(String nombre, int poblacion, int PIB  ){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.PIB = PIB;

    }
    public  Pais(Pais otro){
        this.nombre = otro.getNombre();         
        this.poblacion = otro.getPoblacion();
        this.PIB = otro.getPIB();
    }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getPoblacion() {
            return poblacion;
        }
        public void setPoblacion(int poblacion) {
            this.poblacion = poblacion;
        }
        public int getPIB() {
            return PIB;
        }
        public void setPIB(int pIB) {
            PIB = pIB;
        }

        public void ImprimirPais(){
            System.out.println("Escribi el pais:" +this.nombre);
            System.out.println("Escribe la poblacion del pais:" +this.poblacion);
            System.out.println("Di cual es el PIB del pais:" +this.PIB);
        }

        public double calcularPibPercapita() {
        if (poblacion == 0) {
            return 0.0;
        }
        return (this.PIB * 100000.0) / this.poblacion;
    }
    public static void main(String[] args) {
     Pais pais1 = new Pais("España", 47450000, 1425500);
        
        System.out.println("--- País 1 ---");
        System.out.println("Nombre: " + pais1.getNombre());
        System.out.println("Población: " + pais1.getPoblacion());
        System.out.println("PIB: " + pais1.getPIB());
        System.out.println("PIB per cápita: " + pais1.calcularPibPercapita());

        // Creación de un objeto usando el constructor por defecto y setters
        Pais pais2 = new Pais();
        pais2.setNombre("Francia");
        pais2.setPoblacion(67750000);
        pais2.setPIB(2780000);

        System.out.println("\n--- País 2 ---");
        System.out.println("Nombre: " + pais2.getNombre());
        System.out.println("PIB per cápita: " + pais2.calcularPibPercapita());
    }
}
    }
    
