public class Vende {
    private Sucursal sucursal;
    private Producto producto;
    private int precioVenta;

    //Constructor sin parametros 
    public  Vende(){
    
    }

    //Constructor con parametros
     public  Vende(Sucursal sucursal, Producto producto, int precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }
    public Vende(Vende otro){
        this.sucursal = otro.getSucursal();
        this.producto = otro.getProducto();
        this.precioVenta = otro.getPrecioVenta();

    }
    

    
    
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
public void ImprmirVenta(){
    System.out.println("Gestion de la venta");
    sucursal.ImprimeSucursal();
    System.out.println("Ofrece el: ");
    producto.ImprimirProducto();
    System.out.println("El precio de la venta es: " +precioVenta+ "€");
}


    
}
