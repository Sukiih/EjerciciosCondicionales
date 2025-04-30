import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = teclado.nextDouble();

        if (valorCompra >= 100.00) {
            double descuento = valorCompra * 0.10;
            double totalConDescuento = valorCompra - descuento;
            System.out.println("¡Descuento aplicado del 10%!");
            System.out.println("Total a pagar con descuento: $" + totalConDescuento);
        } else {
            System.out.println("No se aplica descuento. Total a pagar: $" + valorCompra);
        }

        teclado.close();
    }
}
