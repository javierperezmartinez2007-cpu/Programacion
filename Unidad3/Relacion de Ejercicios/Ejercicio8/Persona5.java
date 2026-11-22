

public class Persona5 {
    private String nombre;
    private int edad;
    private String telefono;
    private String poblacion;

    // Constructor vacío
    public Persona5() {
    }

    // Constructor completo
    public Persona5(String nombre, int edad, String telefono, String poblacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Teléfono: " + telefono + " | Población: " + poblacion);
    }
}
