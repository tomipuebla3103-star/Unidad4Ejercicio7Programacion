public class ClientePremium extends Cliente{

    public ClientePremium(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {

        return subtotal * 0.15;
    }
}
