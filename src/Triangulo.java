import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer lado:");
        int primerLado = teclado.nextInt();
        System.out.println("Ingrese el segundo lado:");
        int segundoLado = teclado.nextInt();
        System.out.println("Ingrese el tercer lado:");
        int tercerLado = teclado.nextInt();

        if (primerLado + segundoLado > tercerLado && segundoLado + tercerLado > primerLado
                && primerLado + tercerLado > segundoLado){
            System.out.println("Los lados pueden formar un triangulo");
        } else {
            System.out.println("Los lados no pueden formar un triángulo");
        }

    }
}
