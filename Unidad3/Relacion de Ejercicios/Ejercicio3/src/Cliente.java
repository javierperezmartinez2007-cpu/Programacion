
public class Cliente {
   private  int DNI;
   private  int codigo; 
   private  String nombre;
   private  String Ciudad;
   private  int FechaNacimiento;
    private Sucursal sucursal;

    public Cliente(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    //Constructor por defecto
    public Cliente(){
    }

    //Constructor con paramentros 
   public   Cliente(int DNI, int codigo, String nombre, String Ciudad, int FechaNacimiento, Sucursal sucursal){
        this.nombre = nombre;
        this.DNI = DNI;
        this.codigo = codigo;
        this.Ciudad = Ciudad;
        this.FechaNacimiento = FechaNacimiento;
        this.sucursal = sucursal;

    }

    public Cliente(Cliente otro){
        this.nombre = otro.getNombre();
        this.DNI = otro.getDNI();
        this.codigo = otro.getCodigo();
        this.Ciudad = otro.getCiudad();
        this.FechaNacimiento = otro.getFechaNacimiento();
        this.sucursal = otro.getSucursal();
    }


    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public int getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(int fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
 public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
   

  

   public  void ImprimeCliente(){
        System.out.println("Nombre: " +nombre);
        System.out.println("DNI: " +DNI);
        System.out.println("Codigo: " +codigo);
        System.out.println("Ciudad: " +Ciudad);
        System.out.println("Fecha de nacimiento: " +FechaNacimiento );
    //     sucursal.ImprimeSucursal();
    //     System.out.println("Descuento aplicado: " + descuento + "%");
 }
    }

   


