<img width="408" height="350" alt="image" src="https://github.com/user-attachments/assets/3e7a7d4f-f465-405d-802e-638514c2bcc5" />

 Sistema de Descuentos Comerciales por Tipo de Cliente

Descripción

Este proyecto consiste en desarrollar un sistema de descuentos comerciales en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo, la herencia y la abstracción.

El sistema permite calcular el precio final de una compra según el tipo de cliente, diferenciando entre clientes regulares, premium y corporativos, cada uno con su propio porcentaje de descuento.

Objetivo

Implementar un sistema que permita calcular descuentos de manera polimórfica, delegando en cada tipo de cliente la responsabilidad de determinar su propia bonificación.

Clases utilizadas

Cliente: Clase abstracta que contiene los atributos nombre y dni, además del método abstracto aplicarDescuento(double subtotal).

ClienteRegular: Representa a los clientes regulares y aplica su porcentaje de descuento correspondiente.

ClientePremium: Representa a los clientes premium y aplica una bonificación diferente.

ClienteCorporativo: Representa a los clientes corporativos y define su propio porcentaje de descuento.

Factura: Clase encargada de recibir un cliente y calcular el total a pagar según el descuento correspondiente.

Main: Contiene el método principal, instancia los diferentes tipos de clientes y simula distintas compras.

Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Encapsulamiento.

Desacoplamiento entre clases.

Cálculos matemáticos.

Funcionamiento

Se define la clase abstracta Cliente con los atributos generales y el método aplicarDescuento().

Se crean las clases ClienteRegular, ClientePremium y ClienteCorporativo, cada una con su propia lógica de descuento.

La clase Factura recibe un objeto de tipo Cliente y calcula el precio final sin necesidad de identificar su subclase.

Desde el método main se crean diferentes clientes y se simulan compras con distintos subtotales.

Cada cliente aplica su descuento de manera polimórfica.

Finalmente, se muestra por consola el subtotal, el descuento aplicado y el total a pagar.

Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

Resultado esperado

Al ejecutar el programa, el sistema podrá calcular el precio final de diferentes compras según la categoría de cada cliente. Cada tipo de cliente aplicará su propio descuento mediante el polimorfismo, mostrando por consola el desglose de cada factura.
