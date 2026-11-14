public class Factura {
    private Cliente cliente;
    private double subtotal;

    public Factura(Cliente cliente, double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public void calcularTotal() {

        double descuento = cliente.aplicarDescuento(subtotal);

        double total = subtotal - descuento;

        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        System.out.println("----------------------");
    }
}
