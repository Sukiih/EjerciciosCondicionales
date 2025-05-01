import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del préstamo:");
        int valorPrestamo = teclado.nextInt();

        if (valorPrestamo >= 1000 && valorPrestamo <= 5000){
            System.out.println("Prestamo permitido.");
        } else {
            System.out.println("El valor " + valorPrestamo + " no está dentro del intervalo " +
                    "permitido para el préstamo.");
        }
        teclado.close();
    }
}
