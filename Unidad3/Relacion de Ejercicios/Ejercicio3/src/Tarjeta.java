public class Tarjeta {
   private  int numero;
   private  int codigo;
   private  String nombre;
   private  int fechavencimiento;
   private  Cliente cliente;
//Constructor por defecto
    public Tarjeta(){}

// Constructor con parametros
public Tarjeta(int numero, int codigo, String nombre, int fechavencimiento, Cliente cliente){
    this.numero = numero;
    this.codigo = codigo;
    this.nombre = nombre;
    this.fechavencimiento = fechavencimiento;
    this.cliente = cliente;
}
public Tarjeta(Tarjeta otro){
    this.numero = otro.getNumero();
    this.codigo = otro.getCodigo();
    this.nombre = otro.getNombre();
    this.fechavencimiento = otro.getFechavencimiento();
    this.cliente = otro.getCliente();
}

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
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
    public int getFechavencimiento() {
        return fechavencimiento;
    }
    public void setFechavencimiento(int fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }
    public Cliente getCliente(){return cliente;}
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void ImprimeTarjeta(){
        System.out.println("Numero de la tarjeta: " +numero);
        System.out.println("Codigo de la tarjeta: " +codigo);
        System.out.println("Nombre de la tarjeta: " +nombre);
        System.out.println("Fecha de vencimiento de la tarjeta: " +fechavencimiento);
        if (cliente != null){
            System.out.println("Propietario; ");
            cliente.ImprimeCliente();
        }
    }
}
