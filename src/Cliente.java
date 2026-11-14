public abstract class Cliente {
    protected String nombre;
    protected String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract double aplicarDescuento(double subtotal);
}
