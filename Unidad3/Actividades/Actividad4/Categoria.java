
public class Categoria {
    private String nombre;
    private String codigo;

    //Constructor
    public Categoria (String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } 

    public void imprimeCategoria(){
        System.err.println("Tu codigo es: "+this.codigo);
        System.err.println("Tu nombre es: " +this.nombre);
    }

    
}
