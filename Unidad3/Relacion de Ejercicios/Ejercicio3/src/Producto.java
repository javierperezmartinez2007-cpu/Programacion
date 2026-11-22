public class Producto {
   private  int codigo;
   private  String descripcion;
   private  String color;
   private  int costo;
//Constructor sin parametros 
public Producto(){}



    public Producto(int codigo, String descripcion, String color, int costo) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.color = color;
    this.costo = costo;
}
    public Producto(Producto otro){
        this.codigo = otro.getCodigo();
        this.descripcion = otro.getDescripcion();
        this.color = otro.getColor();
        this.costo = otro.getCosto();

    }



    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
  public  void ImprimirProducto(){
    System.out.println("El codigo del producto es: " +codigo);
    System.out.println("La descripción del producto es: " +descripcion);
    System.out.println("El color del producto es: " +color);
    System.out.println("El costo del producto es: " +costo);
  }

    
}
