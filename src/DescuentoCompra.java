import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = teclado.nextDouble();

        if (valorCompra >= 100.00) {
            double descuento = valorCompra * 0.10;
            double totalConDescuento = valorCompra - descuento;
            System.out.println("Descuento del 10% aplicado.");
            System.out.println("Nuevo valor: $" + totalConDescuento);
        } else {
            System.out.println("Descuento no aplicado.");
            System.out.println("Valor total: $" + valorCompra);
        }

        teclado.close();
    }
}
