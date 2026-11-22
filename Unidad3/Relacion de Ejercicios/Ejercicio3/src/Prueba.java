public class Prueba {
    public static void main(String[] args) {
        System.out.println("--- 1. PROBANDO CLIENTE Y TARJETA ---");
        Cliente cliente1 = new Cliente(23323232, 0, "Javier", "Madrid", 0, null);
        Tarjeta tarjeta1 = new Tarjeta(123456789, 123, "Javier", 2025, cliente1);
        tarjeta1.ImprimeTarjeta();
        
        System.out.println("\n--- 2. PROBANDO FÁBRICA Y PRODUCTO ---");
        Fabrica fabrica1 = new Fabrica(0, "España", "Javier", null, 0, null);
        Producto producto1 =new Producto(0, null, null, 0);
        producto1.ImprimirProducto();

        System.out.println("\n--- 3. PROBANDO RELACIONES N:M (TRABAJA Y VENDE) ---");
        Sucursal sucursal1 = new Sucursal(10, "Avenida de Andalucía 12", "Almería");
        Empleado empleado1 = new Empleado(0, null, null, null, null, null, null, 0);

        // Relación Trabaja (Sucursal - Empleado con horario y día)
        Trabaja relacionTrabajo = new Trabaja(sucursal1, empleado1, "08:00 - 15:00", "Lunes a Viernes");
        relacionTrabajo.ImprimeTrabaja();

        System.out.println();
        // Relación Vende (Sucursal - Producto con precioVenta)
        Vende relacionVenta = new Vende(sucursal1, producto1, 0);
        relacionVenta.ImprmirVenta();
    }
}