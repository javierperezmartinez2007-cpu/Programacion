public class Sucursal {
 private int numero;
 private   String ciudad;
 private   String domicilio;
//Constructor sin parametros
    public Sucursal(){}

//Constructor con parametros
public Sucursal(int numero, String ciudad, String domicilio){
    this.numero = numero;
    this.ciudad = ciudad;
    this.domicilio = domicilio;
}

public Sucursal (Sucursal otro){
    this.numero = otro.getNumero();
    this.ciudad = otro.getCiudad();
    this.domicilio = otro.getDomicilio();
}

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void ImprimeSucursal(){
        System.out.println("Numero de sucursal " +numero);
        System.out.println("Ciudad de la sucursal: " +ciudad);
        System.out.println("Domicilio de la sucursal: " +domicilio);
    }
    
}
