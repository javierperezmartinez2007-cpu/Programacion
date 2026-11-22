public class Trabaja {
    private Sucursal sucursal;
    private Empleado empleado;
    private String Horario;
    private String Dia;

//Constructor sin parametros 
public Trabaja(){}
// Constructor con parametros
public Trabaja(Sucursal sucursal, Empleado empleado, String horario, String dia) {
    this.sucursal = sucursal;
    this.empleado = empleado;
    this.Horario = horario;
    this.Dia = dia;
}
public Trabaja (Trabaja otro){
    this.sucursal = otro.getSucursal();
    this.empleado = otro.getEmpleado();
    this.Horario = otro.getHorario();
    this.Dia = otro.getDia();
}


public Sucursal getSucursal() {
    return sucursal;
}

public void setSucursal(Sucursal sucursal) {
    this.sucursal = sucursal;
}

public Empleado getEmpleado() {
    return empleado;
}

public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
}

public String getHorario() {
    return Horario;
}

public void setHorario(String horario) {
    Horario = horario;
}

public String getDia() {
    return Dia;
}

public void setDia(String dia) {
    Dia = dia;
}

public void ImprimeTrabaja(){
    System.out.println("DATOS DEL TRABAJO");
    empleado.ImprimirEmpleado();
    System.out.println("Trabaja en la: ");
    sucursal.ImprimeSucursal();
    System.out.println("Dias: " +Dia+ "Horario: " +Horario);
}

}
