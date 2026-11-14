public class ClienteCorporativo extends Cliente{
    public ClienteCorporativo(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {

        return subtotal * 0.25;
    }
}
