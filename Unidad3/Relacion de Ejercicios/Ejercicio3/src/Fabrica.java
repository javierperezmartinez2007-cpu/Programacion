public class Fabrica {
   private  int CUIT;
   private  String pais;
   private  String nombre;
   private  String gerente;
   private  int CantEmp;
   private  Producto producto;

    // Constructor sin parametros
    public Fabrica(){}

    // Constructor con parametros 
    public  Fabrica(int cUIT, String pais, String nombre, String gerente, int cantEmp, Producto producto) {
        this.CUIT = cUIT;
        this.pais = pais;
        this.nombre = nombre;
        this.gerente = gerente;
        this.CantEmp = cantEmp;
        this.producto = producto;
    }

public Fabrica (Fabrica otro){
    this.CUIT = otro.getCUIT();
    this.pais = otro.getPais();
    this.nombre = otro.getNombre();
    this.gerente = otro.getGerente();
    this.CantEmp = otro.getCantEmp();
    this.producto = otro.getProducto();

}


    public int getCUIT() {
        return CUIT;
    }
    public void setCUIT(int cUIT) {
        CUIT = cUIT;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public int getCantEmp() {
        return CantEmp;
    }
    public void setCantEmp(int cantEmp) {
        CantEmp = cantEmp;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    private void ImprimirFabrica(){
        System.out.println("Este es el CUIT de la fabrica: " +CUIT);
        System.out.println("La fabrica esta en: " +pais);
        System.out.println("El nombre de la fabrica es: " +nombre);
        System.out.println("El gerente de la empresa es: " +gerente);
        System.out.println("La cantidad de empleados de la empresa son: " +CantEmp);
        if (producto != null){
            System.out.println("El producto es: ");
            producto.ImprimirProducto();
        }
    }
}
