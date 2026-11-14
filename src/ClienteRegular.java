public class ClienteRegular extends Cliente{
    public ClienteRegular(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {

        return subtotal * 0.05;
    }

}
