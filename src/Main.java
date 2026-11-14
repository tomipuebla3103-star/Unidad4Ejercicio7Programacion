//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ClienteRegular regular = new ClienteRegular("Juan", "12345678");

    ClientePremium premium = new ClientePremium("Pedro", "23456789");

    ClienteCorporativo corporativo = new ClienteCorporativo("Carlos", "34567890");

    Factura factura1 = new Factura(regular, 100000);

    Factura factura2 = new Factura(premium, 100000);

    Factura factura3 = new Factura(corporativo, 100000);

    factura1.calcularTotal();

    factura2.calcularTotal();

    factura3.calcularTotal();
}
